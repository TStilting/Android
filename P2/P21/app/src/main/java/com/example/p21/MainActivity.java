package com.example.p21;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public int counter_left;
    public int counter_right;
    String string_left = String.valueOf(counter_left);
    String string_right = String.valueOf(counter_right);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}