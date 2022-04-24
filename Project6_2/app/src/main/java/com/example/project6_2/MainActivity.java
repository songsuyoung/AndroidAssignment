package com.example.project6_2;


import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.project6_2.R;

public class MainActivity extends AppCompatActivity {

    Chronometer chrono;
    RadioButton rdoCal,rdoTime;
    TimePicker tPicker;
    DatePicker datePicker;
    TextView tvYear, tvMonth, tvDay,tvHour, tvMinute;

    int selectYear,selectMonth,selectDay;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("2019038105 송수영");


        chrono = (Chronometer) findViewById(R.id.chronometer1);

        rdoCal = (RadioButton) findViewById(R.id.rdoCal);
        rdoTime = (RadioButton) findViewById(R.id.rdoTime);

        tPicker = (TimePicker) findViewById(R.id.timePicker1);
        datePicker = (DatePicker)findViewById(R.id.datePicker);

        tvYear = (TextView) findViewById(R.id.tvYear);
        tvMonth = (TextView) findViewById(R.id.tvMonth);
        tvDay = (TextView) findViewById(R.id.tvDay);
        tvHour = (TextView) findViewById(R.id.tvHour);
        tvMinute = (TextView) findViewById(R.id.tvMinute);

        tPicker.setVisibility(View.INVISIBLE);
        datePicker.setVisibility(View.INVISIBLE);
        rdoCal.setVisibility(View.INVISIBLE);
        rdoTime.setVisibility(View.INVISIBLE);

        tvYear.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                chrono.stop();
                chrono.setTextColor(Color.BLUE);
                tvYear.setText(Integer.toString(selectYear) + "년 ");
                tvMonth.setText(Integer.toString(selectMonth) +"월 ");
                tvDay.setText(Integer.toString(selectDay) +"일 ");
                tvHour.setText(Integer.toString(tPicker.getCurrentHour()) + "시 ");
                tvMinute.setText(Integer.toString(tPicker.getCurrentMinute()) + "분");
                rdoCal.setVisibility(View.INVISIBLE);
                rdoTime.setVisibility(View.INVISIBLE);
                datePicker.setVisibility(View.INVISIBLE);
                tPicker.setVisibility(View.INVISIBLE);
                return false;
            }
        });
        chrono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rdoCal.setVisibility(View.VISIBLE);
                rdoTime.setVisibility(View.VISIBLE);
                chrono.setBase(SystemClock.elapsedRealtime());
                chrono.start();
                chrono.setTextColor(Color.RED);
            }
        });

        rdoCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tPicker.setVisibility(View.VISIBLE);
                datePicker.setVisibility(View.INVISIBLE);
            }
        });

        rdoTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tPicker.setVisibility(View.INVISIBLE);
                datePicker.setVisibility(View.VISIBLE);
            }
        });

        datePicker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                selectYear = year;
                selectMonth = monthOfYear + 1;
                selectDay = dayOfMonth;
            }
        });

    }
}