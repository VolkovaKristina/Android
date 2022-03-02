package com.example.twoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity implements View.OnClickListener {
    Button btnActThree;
    TextView textView;
    Button button_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        btnActThree = (Button) findViewById(R.id.btnActThree);
        btnActThree.setOnClickListener(this);

        textView = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        textView.setText(name);

        button_menu = (Button) findViewById(R.id.button_menu);
        button_menu.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActThree:
                Intent intent = new Intent(this, ActivityThree.class);
                startActivity(intent);
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