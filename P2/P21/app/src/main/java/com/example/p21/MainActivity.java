package com.example.p21;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public int counter_left = 0;
    public int counter_right = 0;
    TextView string_left;
    TextView string_right;
    Button buttonL;
    Button buttonR;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonL = (Button)findViewById(R.id.buttonLeft);
        string_left = (TextView)findViewById(R.id.buttonLeft);
        buttonR = (Button)findViewById(R.id.buttonRight);
        string_right = (TextView)findViewById(R.id.buttonRight);
        reset = (Button)findViewById(R.id.buttonReset);
    }

    public void pressedLeft(View button_left) {
        counter_left++;
        string_left.setText(Integer.toString(counter_left));
        if(counter_left >= 100) {
            counter_left = 99;
        }
    }

    public void undoLeft(View undo_left) {
        counter_left--;
        string_left.setText(Integer.toString(counter_left));
        if(counter_left <= 0) {
            counter_left = 0;
        }
    }

    public void pressedRight(View button_right) {
        counter_right++;
        string_right.setText(Integer.toString(counter_right));
        if(counter_right >= 100) {
            counter_right = 99;
        }
    }

    public void undoRight(View undo_right) {
        counter_right--;
        string_right.setText(Integer.toString(counter_right));
        if(counter_right <= 0) {
            counter_right = 0;
        }
    }


    public void pressedReset(View button_reset) {
        counter_left = 0;
        counter_right = 0;
        string_left.setText(Integer.toString(counter_left));
        string_right.setText(Integer.toString(counter_right));
    }
}