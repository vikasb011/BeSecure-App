package com.example.dell.besecure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by DELL on 12/07/2017.
 */
public class splash extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Thread mythread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(1500);
                    Intent intent = new Intent(getApplicationContext(), decrypt.class);
                    startActivity(intent);
                    finish();
                    }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };
        mythread.start();
    }
}
