package com.example.gb_android_homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button = findViewById(R.id.buttonToOtherActivity);
        button.setOnClickListener(v -> startActivity(new Intent(MainActivity2.this, CalendarActivity.class)));
    }
}