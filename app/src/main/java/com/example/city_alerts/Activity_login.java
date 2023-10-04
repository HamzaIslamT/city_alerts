package com.example.city_alerts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class Activity_login extends AppCompatActivity {

    private MaterialButton loginbtn;
    TextView goforsignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginbtn = findViewById(R.id.login_btn);
        goforsignin = findViewById(R.id.goforsignin);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_login.this,Activity_dashboard.class);
                startActivity(intent);
            }
        });

        goforsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_login.this,Activity_signup.class);
                startActivity(intent);
            }
        });


    }


    public void onBackPressed() {
        finishAffinity();
    }
}
