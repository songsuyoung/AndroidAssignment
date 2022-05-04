package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    RadioButton SecRadio;
    RadioButton ThirdRadio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        super.setTitle("나 자바 봐라~");
        Button btnSecActivity=(Button) findViewById(R.id.btnNewActivity);
        SecRadio=(RadioButton)findViewById(R.id.rdoSecond);
        ThirdRadio=(RadioButton)findViewById(R.id.rdoThird);

        btnSecActivity.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent intent;
                if(SecRadio.isChecked())
                    intent = new Intent(getApplicationContext(),SecActivity.class);
                else
                    intent = new Intent(getApplicationContext(),ThirdActivity.class);
                startActivity(intent);
            }
        });
    }
}