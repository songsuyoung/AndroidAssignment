package com.example.project4_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    Switch switch1;
    RadioGroup rGroup;
    RadioButton s,q,r;
    Button btnQuit;
    Button btnStart;
    ImageView img;
    TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 사진 보기");
        switch1=(Switch) findViewById(R.id.switch1);

        text2=(TextView) findViewById(R.id.textView2);
        rGroup=(RadioGroup) findViewById(R.id.rGroup);
        r=(RadioButton) findViewById(R.id.R);
        s=(RadioButton) findViewById(R.id.S);
        q=(RadioButton) findViewById(R.id.Q);
        btnQuit=(Button) findViewById(R.id.button);
        btnStart=(Button) findViewById(R.id.button2);
        img=(ImageView)findViewById(R.id.imageView);
        text2.setVisibility(View.INVISIBLE);
        rGroup.setVisibility(View.INVISIBLE);
        btnQuit.setVisibility(View.VISIBLE);
        btnStart.setVisibility(View.VISIBLE);
        img.setVisibility(View.INVISIBLE);
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(switch1.isChecked()){
                    text2.setVisibility(View.VISIBLE);
                    rGroup.setVisibility(View.VISIBLE);
                    btnQuit.setVisibility(View.VISIBLE);
                    btnStart.setVisibility(View.VISIBLE);
                    img.setVisibility(View.VISIBLE);
                }else{
                    text2.setVisibility(View.INVISIBLE);
                    rGroup.setVisibility(View.INVISIBLE);
                    btnQuit.setVisibility(View.VISIBLE);
                    btnStart.setVisibility(View.VISIBLE);
                    img.setVisibility(View.INVISIBLE);
                }
            }
        });

        rGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(r.isChecked())
                    img.setImageResource(R.drawable.r);
                if(s.isChecked())
                    img.setImageResource(R.drawable.s);
                if(q.isChecked())
                    img.setImageResource(R.drawable.q);
            }
        });

        btnQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch1.setChecked(false);
            }
        });

    }
}