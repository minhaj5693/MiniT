package com.app.minitoast;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.app.mtoast.MiniToasting;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new MiniToasting(MainActivity.this).showToastMessage("Hi There");
    }
}
