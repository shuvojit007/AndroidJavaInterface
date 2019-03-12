package com.example.androidjavainterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonOne buttonOne = new ButtonOne();
        buttonOne.setMainActivityOne(this);


    }


    public void onClick(int viewId) {
        //handle event somehow
    }
}
