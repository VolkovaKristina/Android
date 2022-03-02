package com.example.twoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityThree extends AppCompatActivity implements View.OnClickListener {
    Button btnActFour;
    Button button_menu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        btnActFour = (Button) findViewById(R.id.btnActFour);
        btnActFour.setOnClickListener(this);

        button_menu = (Button) findViewById(R.id.button_menu);
        button_menu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActFour:
                Intent intents = new Intent(this, ActivityFour.class);
                startActivity(intents);
                break;
            case R.id.button_menu:
                Intent intent_menu = new Intent(this, MainActivityMenu.class);
                startActivity(intent_menu);
                break;
            default:
                break;
        }
    }
}