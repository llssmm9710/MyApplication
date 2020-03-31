package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private static final String TAG = "MyActivity";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e(TAG,"onCreate() called!");
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG,"onResume() called!");
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG,"Sungmin's onSrart() called!");
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(TAG,"Sungmin's onResrart() called! Baam!");
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG,"Sungmin's onStop() called! Baam!");
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG,"Sungmin's onPause() called! Baam!");
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG,"Sungmin's onDestroy() called! Baam!");
    }

}
