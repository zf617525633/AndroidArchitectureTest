package com.nanguiyu.androidarchitecturetest;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("测试").create().show();
    }
}
