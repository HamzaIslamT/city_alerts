package com.example.city_alerts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ImageView;

public class Animation extends AppCompatActivity {

    ImageView bg, logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        bg = findViewById(R.id.bg);
        logo = findViewById(R.id.logo);

        logo.animate().translationY(4000).setStartDelay(1000).setStartDelay(2000);
        bg.animate().translationY(-4000).setDuration(1000).setStartDelay(2000);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Animation.this, Activity_login.class);
                startActivity(intent);
            }
        }, 3000);

    }
}
