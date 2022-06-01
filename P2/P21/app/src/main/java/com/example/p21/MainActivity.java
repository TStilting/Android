package com.example.p21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public int counter_left = 0;
    public int counter_right = 0;
    Button button_left;
    Button button_right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_left = (Button) findViewById(R.id.buttonLeft);
        button_right = (Button) findViewById(R.id.buttonRight);
    }
}