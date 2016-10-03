package com.cedulio.exam.android.jokes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import jokeSmith.Joker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ((TextView)findViewById(R.id.text)).setText(new Joker().getJoke());
    }
}
