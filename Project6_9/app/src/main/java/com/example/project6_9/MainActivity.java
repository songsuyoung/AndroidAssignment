package com.example.project6_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("2019038105 송수영");
        CustomFragment fragment = new CustomFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frame,fragment); // 삽입할 위치, 삽입할 fragment
        fragmentTransaction.commit(); // 트랜잭션 종료
    }
}