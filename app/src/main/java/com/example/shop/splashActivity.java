package com.example.shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_splash );
// for screen delay
        new Handler ().postDelayed ( new Runnable () {
            @Override
            public void run() {

                startActivity ( new Intent (splashActivity.this,MainActivity.class) );
            }
        },2000 );

    }
}