package com.example.project5_7;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("2019038105 송수영");
        editText = findViewById(R.id.editText4);
        textView = findViewById(R.id.textView);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                textView.setText((start + count) + " / " + 80 + " 바이트");
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
    // 전송버튼 클릭 시 동작
    public void onButton1Clicked(View v) {
        sendToast();
    }

    // Toast 메시지를 출력한다.
    private void sendToast() {
        Toast.makeText(this, editText.getText(), Toast.LENGTH_LONG).show();
    }
}