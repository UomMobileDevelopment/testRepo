package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btnSendName);

        final EditText txtName = findViewById(R.id.txtName);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String givenName = txtName.getText().toString();
                Intent intent = new Intent(
                                        MainActivity.this,
                                        SecondActivity.class);

                intent.putExtra("name", givenName);
                intent.putExtra("age", 34);

                startActivity(intent);
            }
        });
    }
}
