package com.example.jm.project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class LifecycleLogging extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(getClass().getSimpleName(), "onCreate()");
    }
    @Override
    public void onRestart() {
        super.onRestart();
        Log.d(getClass().getSimpleName(), "onRestart()");
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.d(getClass().getSimpleName(), "onStart()");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d(getClass().getSimpleName(), "onResume()");
    }
    @Override
    public void onPause() {
        Log.d(getClass().getSimpleName(), "onPause()");
        super.onPause();
    }
    @Override
    public void onStop() {
        Log.d(getClass().getSimpleName(), "onStop()");
        super.onStop();
    }
    @Override
    public void onDestroy() {
        Log.d(getClass().getSimpleName(), "onDestroy()");
        super.onDestroy();
    }

}
