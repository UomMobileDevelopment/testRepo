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
        int age = intent.getIntExtra("age", 0);
        //update view
        
        //MASTER CHANGE !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        int theResult = age * 45 - 18; // customer changed mind. will be merged later

        txtGreeting.setText("Hello there dear, "+name + " you are "+age+" years old");

    }
}
