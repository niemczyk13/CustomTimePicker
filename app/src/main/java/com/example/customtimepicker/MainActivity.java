package com.example.customtimepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.customtimepicker.view.CustomTimePicker;

public class MainActivity extends AppCompatActivity {
    private CustomTimePicker customTimePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customTimePicker = findViewById(R.id.custom_time_picker);
        customTimePicker.addKeyboardInputListener(() -> {
            System.out.println("Keyboard: Godzina: " + customTimePicker.getHour() + ":" + customTimePicker.getMinute());
        });

        customTimePicker.addClockFaceClickListener(() -> {
            System.out.println("Clock face click: " + customTimePicker.getHour() + ":" + customTimePicker.getMinute());
        });
    }
}