package com.example.p3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Locatie> locaties;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void locatieToevoegen() {
        locaties = new ArrayList<>();
        locaties.add(new Locatie("", "", 0));
    }
}