package com.cedulio.exam.android.androidjokelib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final java.lang.String JOKE_KEY = "JOKE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        String joke = getIntent().getExtras().getString(JOKE_KEY);

        ((TextView)findViewById(R.id.textJoke)).setText(joke);
    }
}
