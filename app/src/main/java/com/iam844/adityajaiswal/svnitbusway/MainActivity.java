package com.iam844.adityajaiswal.svnitbusway;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppRater.app_launched(this);
        setContentView(R.layout.activity_main);


    }

}

