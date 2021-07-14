package com.example.countapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   TextView tv;
   int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        tv=findViewById(R.id.text);
        if(savedInstanceState!=null&&savedInstanceState.containsKey("scores")){
            //meams we have data
            score=savedInstanceState.getInt("scores");
            tv.setText(String.valueOf(score));
        }
    }


    public void toast(View view) {
        Toast.makeText(this, "Welcome to the countapp", Toast.LENGTH_LONG).show();
    }



    public void counts(View view) {
    score++;
    tv.setText(String.valueOf(score));
    }

    public void dec(View view) {
        score--;
        tv.setText(String.valueOf(score));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("scores",score);//Score the data before activity destructuin
    }
}