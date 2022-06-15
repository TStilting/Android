package com.example.p22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView question1;
    TextView question2;
    TextView question3;

    TextView string_score;
    int number_score = 0;

    Button button_left1;
    Button button_left2;
    Button button_left3;

    Button button_right1;
    Button button_right2;
    Button button_right3;

    String correct;
    String wrong;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        question1 = (TextView)findViewById(R.id.question1);
        question2 = (TextView)findViewById(R.id.question2);
        question3 = (TextView)findViewById(R.id.question3);
        string_score = (TextView)findViewById(R.id.score_number);

        button_left1 = (Button)findViewById(R.id.button_left1);
        button_left2 = (Button)findViewById(R.id.button_left2);
        button_left3 = (Button)findViewById(R.id.button_left3);

        button_right1 = (Button)findViewById(R.id.button_right1);
        button_right2 = (Button)findViewById(R.id.button_right2);
        button_right3 = (Button)findViewById(R.id.button_right3);

        correct = (String)"Correct";
        wrong = (String)"Wrong";

    }

    public void pressedLeft1(View button_left1) {

        question1.setText(correct);
        number_score++;
        string_score.setText("" + number_score + "/3");
        remove1();
    }

    public void pressedRight1(View button_right1) {

        question1.setText(wrong);
        remove1();
    }

    public void pressedLeft2(View button_left2) {

        question2.setText(correct);
        number_score++;
        string_score.setText("" + number_score + "/3");
        remove2();
    }

    public void pressedRight2(View button_right2) {

        question2.setText(wrong);
        remove2();
    }

    public void pressedLeft3(View button_left3) {

        question3.setText(wrong);
        remove3();
    }

    public void pressedRight3(View button_right3) {

        question3.setText(correct);
        number_score++;
        string_score.setText("" + number_score + "/3");
        remove3();
    }

    public void remove1() {
        button_left1.setVisibility(View.GONE);
        button_right1.setVisibility(View.GONE);
    }
    public void remove2() {
        button_left2.setVisibility(View.GONE);
        button_right2.setVisibility(View.GONE);
    }
    public void remove3() {
        button_left3.setVisibility(View.GONE);
        button_right3.setVisibility(View.GONE);
    }
}