package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView txtGreeting = findViewById(R.id.txtGreeting);

        //get intent
        Intent intent = getIntent();
        // read extra
        String name = intent.getStringExtra("name");
        //update view
        
        //MASTER CHANGE !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        txtGreeting.setText("Hello there, "+name + "!!");

    }
}
