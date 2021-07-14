package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    Button date_picker,time_picker;
    int c_year,c_month,c_date;
    int mhours,mMinutes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        date_picker=findViewById(R.id.datepicker);
        time_picker=findViewById(R.id.timepicker);

    }

    public void start(View view) {
        Intent i = new Intent(this,MyService.class);
        startService(i);
    }

    public void stop(View view) {
        Intent i1=new Intent(this,MyService.class);
        stopService(i1);
    }

    public void opendatepicker(View view) {
        Calendar c=Calendar.getInstance();
        c_year=c.get(Calendar.YEAR);
        c_month=c.get(Calendar.MONTH);
        c_date=c.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog data=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                String mydate=dayOfMonth+"-"+month+1+"-"+year;
                Toast.makeText(MainActivity.this, mydate, Toast.LENGTH_SHORT).show();
            }
        },c_year,c_month,c_date);
data.show();
    }

    public void opentimepicker(View view) {
        Calendar c= Calendar.getInstance();
        mhours=c.get(Calendar.HOUR_OF_DAY);
        mMinutes=c.get(Calendar.MINUTE);
        TimePickerDialog time=new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                String mytime=hourOfDay+":"+minute;
                Toast.makeText(MainActivity.this, mytime, Toast.LENGTH_SHORT).show();
            }
        },mhours,mMinutes,false);
        time.show();
    }
}