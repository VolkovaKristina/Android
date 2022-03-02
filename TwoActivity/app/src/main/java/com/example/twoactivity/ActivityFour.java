package com.example.twoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityFour extends AppCompatActivity implements View.OnClickListener {
    Button button_menu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        button_menu = (Button) findViewById(R.id.button_menu);
        button_menu.setOnClickListener(this);

    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_menu:
                Intent intent_menu = new Intent(this, MainActivityMenu.class);
                startActivity(intent_menu);
                break;
            default:
                break;
        }
    }

}