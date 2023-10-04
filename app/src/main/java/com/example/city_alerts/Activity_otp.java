package com.example.city_alerts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Activity_otp extends AppCompatActivity {

    private Button verifycode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        verifycode = findViewById(R.id.verifycode);

        verifycode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_otp.this,Activity_dashboard.class);
                startActivity(intent);
            }
        });

    }
}