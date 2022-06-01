package com.example.p21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public int counter_left;
    public int counter_right;
    Button button_left = (Button) findViewById(R.id.buttonLeft);
    Button button_right = (Button) findViewById(R.id.buttonRight);
    Button button_reset = (Button) findViewById(R.id.buttonReset);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_left.setText(counter_left);
        button_right.setText(counter_right);
    }
}