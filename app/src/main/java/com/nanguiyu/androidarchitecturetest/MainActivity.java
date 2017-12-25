package com.nanguiyu.androidarchitecturetest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private MyLocationListener myLocationListener;

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.dialog_button);
        button.setOnClickListener(this);
        myLocationListener = new MyLocationListener();
        getLifecycle().addObserver(myLocationListener);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        getLifecycle().removeObserver(myLocationListener);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,DialogActivity.class);
        startActivity(intent);

    }
}
