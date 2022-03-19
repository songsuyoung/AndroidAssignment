package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button Viewbtn;
    EditText edit;
    Button Webbtn;

    RadioButton RB_11R;
    RadioButton RB_12S;

    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Viewbtn=(Button) findViewById(R.id.button);
        edit=(EditText) findViewById(R.id.sample_EditText);
        Webbtn=(Button) findViewById(R.id.button2);

        RB_11R=(RadioButton) findViewById(R.id.radioButton);
        RB_12S=(RadioButton) findViewById(R.id.radioButton2);
        image=(ImageView) findViewById(R.id.imageView);

        Viewbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast myToast = Toast.makeText(getApplicationContext(),edit.getText(), Toast.LENGTH_SHORT);
                myToast.show();
            }
        });

        Webbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent;
                myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://"+edit.getText().toString()));
                startActivity(myIntent);
            }
        });
        RB_11R.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.wall);
            }
        });
        RB_12S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.time);
            }
        });

    }
}