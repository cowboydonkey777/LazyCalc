package com.example.lazycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculator();
    }

    public void calculator(){
        //final TextView calcBox = (TextView) findViewById(R.id.textView);
    }

}
