package com.example.twoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnActTwo;
    Button button_menu;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnActTwo = (Button) findViewById(R.id.btnActTwo);
        btnActTwo.setOnClickListener(this);

        editText = (EditText) findViewById(R.id.editText);

        button_menu = (Button) findViewById(R.id.button_menu);
        button_menu.setOnClickListener(this);

    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActTwo:
                Intent intent = new Intent(this, ActivityTwo.class);
                intent.putExtra("name",editText.getText().toString());
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