package com.example.customtimepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.customtimepicker.view.CustomTimePicker;

public class MainActivity extends AppCompatActivity {
    private CustomTimePicker customTimePicker;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customTimePicker = findViewById(R.id.custom_time_picker);
        textView = findViewById(R.id.text_view);

        customTimePicker.addKeyboardInputListener(() -> {
            System.out.println("Keyboard input listener: " + customTimePicker.getHour() + ":" + customTimePicker.getMinute());
            textView.setText("Keyboard input listener: " + customTimePicker.getHour() + ":" + customTimePicker.getMinute());
        });

        customTimePicker.addClockFaceClickListener(() -> {
            System.out.println("Clock face click listener: " + customTimePicker.getHour() + ":" + customTimePicker.getMinute());
            textView.setText("Clock face click listener: " + customTimePicker.getHour() + ":" + customTimePicker.getMinute());
        });

    }
}