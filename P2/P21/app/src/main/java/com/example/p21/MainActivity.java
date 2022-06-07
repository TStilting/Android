package com.example.p21;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public int counter_left;
    public int counter_right;
    String string_left = "" + counter_left;
    String string_right = "" + counter_right;
    Button buttonL;
    Button buttonR;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonL = findViewById(R.id.buttonLeft);
        buttonR = findViewById(R.id.buttonRight);
    }

    public void pressedLeft(View button_left) {
        buttonL.setText(string_left);
        counter_left++;
    }

    public void pressedRight(View button_right) {

    }
}