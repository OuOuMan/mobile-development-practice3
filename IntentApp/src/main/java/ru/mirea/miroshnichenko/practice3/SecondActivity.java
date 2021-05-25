package ru.mirea.miroshnichenko.practice3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView myTextView = (TextView) findViewById(R.id.textView);

        Intent intentFromMain = getIntent();
        String date = intentFromMain.getStringExtra("date");

        myTextView.setText(date);


    }
}