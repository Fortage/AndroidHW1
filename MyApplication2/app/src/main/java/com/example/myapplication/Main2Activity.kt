package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main2.*
import kotlin.math.pow

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        textView2.text = intent.getIntExtra("result", 0).toDouble().pow(2).toInt().toString()
        Log.d( "lifeCycle", "OnCreate")

    }
    override fun onStart() {
        super.onStart()
        Log.d( "lifeCycle", "OnStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d( "lifeCycle", "OnRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d( "lifeCycle", "OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d( "lifeCycle", "OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d( "lifeCycle", "OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d( "lifeCycle", "OnDestroy")
    }
}
