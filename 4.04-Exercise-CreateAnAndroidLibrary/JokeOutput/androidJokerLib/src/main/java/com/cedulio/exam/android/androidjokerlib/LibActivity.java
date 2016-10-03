package com.cedulio.exam.android.androidjokerlib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class LibActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lib);


        Toast.makeText(this, "Lib Joke:" + getIntent().getExtras().getString("JOKE"), Toast.LENGTH_SHORT).show();
    }
}
