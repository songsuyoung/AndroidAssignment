package com.example.project4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText edit1,edit2;
    Button btnAdd,btnSub,btnMul,btnDiv,btnMod;
    TextView textResult;
    String num1,num2;
    Double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("초간단 계산기");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMod=(Button)findViewById(R.id.btnMod);
        textResult = (TextView) findViewById(R.id.textResult);

        edit1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                edit1.setText("");
                return false;
            }
        });
        edit2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                edit2.setText("");
                return false;
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                result = Double.parseDouble(num1) + Double.parseDouble(num2);
                textResult.setText("계산 결과 : " + result.toString());
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                result = Double.parseDouble(num1) - Double.parseDouble(num2);
                textResult.setText("계산 결과 : " + result.toString());
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                result = Double.parseDouble(num1) * Double.parseDouble(num2);
                textResult.setText("계산 결과 : " + result.toString());
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                result = Double.parseDouble(num1) / Double.parseDouble(num2);
                textResult.setText("계산 결과 : " + result.toString());
            }
        });
        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                result = Double.parseDouble(num1) % Double.parseDouble(num2);
                textResult.setText("계산 결과 : " + result.toString());
            }
        });
    }
}
