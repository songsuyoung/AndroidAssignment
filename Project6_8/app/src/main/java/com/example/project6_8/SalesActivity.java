package com.example.project6_8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class SalesActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);

        findViewById(R.id.btnCustomMenu02).setOnClickListener(this);
        findViewById(R.id.btnCustomLogin02).setOnClickListener(this);

        Intent intent = getIntent();
        String prev = intent.getExtras().getString("from");

        Toast.makeText(getApplicationContext(), prev + " -> Custom", Toast.LENGTH_SHORT).show();
    }

    ActivityResultLauncher MoveAtCustom = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {

        @Override
        public void onActivityResult(ActivityResult result) {

        }
    });

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.btnCustomMenu02:
                intent = new Intent(this, MenuActivity.class);
                intent.putExtra("from", "Custom");
                MoveAtCustom.launch(intent);
                finish();
                break;
            case R.id.btnCustomLogin02:
                intent = new Intent(this, MainActivity.class);
                intent.putExtra("from", "Custom");
                MoveAtCustom.launch(intent);
                finish();
                break;
        }
    }
}