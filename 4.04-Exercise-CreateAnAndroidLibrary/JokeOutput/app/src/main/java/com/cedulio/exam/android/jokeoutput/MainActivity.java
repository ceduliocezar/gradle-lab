package com.cedulio.exam.android.jokeoutput;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cedulio.exam.android.androidjokerlib.LibActivity;
import com.example.TheJoker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String joke = new TheJoker().getJoke();

        Intent i = new Intent(this, LibActivity.class);


        i.putExtra("JOKE", joke);

        startActivity(i);
    }
}
