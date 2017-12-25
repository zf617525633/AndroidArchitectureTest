package com.nanguiyu.androidarchitecturetest;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;


public class MyLocationListener implements LifecycleObserver {

    private static String TAG = "MyLocationListener";

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void start(){
        Log.d(TAG,"start");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume(){
        Log.d(TAG,"onResume");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void stop(){
        Log.d(TAG,"stop");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause(){
        Log.d(TAG,"onPause");
    }
}
