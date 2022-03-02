package com.example.twoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityMenu extends AppCompatActivity implements View.OnClickListener{
    Button btnActOne;
    Button btnActTwo;
    Button btnActThree;
    Button btnActFour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        btnActOne = (Button) findViewById(R.id.btnActOne);
        btnActOne.setOnClickListener(this);

        btnActTwo = (Button) findViewById(R.id.btnActTwo);
        btnActTwo.setOnClickListener(this);

        btnActThree = (Button) findViewById(R.id.btnActThree);
        btnActThree.setOnClickListener(this);

        btnActFour = (Button) findViewById(R.id.btnActFour);
        btnActFour.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActOne:
                Intent intent_one = new Intent(this, MainActivity.class);
                startActivity(intent_one);
                break;
            case R.id.btnActTwo:
                Intent intent_two = new Intent(this, ActivityTwo.class);
                startActivity(intent_two);
                break;
            case R.id.btnActThree:
                Intent intent_three = new Intent(this, ActivityThree.class);
                startActivity(intent_three);
                break;
            case R.id.btnActFour:
                Intent intents = new Intent(this, ActivityFour.class);
                startActivity(intents);
                break;

        }
    }

}