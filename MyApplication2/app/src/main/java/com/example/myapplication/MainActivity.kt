package com.example.myapplication


import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    private var CounterChangeConfig : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.text = CounterChangeConfig.toString()
        Log.d("lifeCycle", "OnCreate")
        button.setOnClickListener {
            val goIntent = Intent(this,Main2Activity::class.java)
            goIntent.putExtra("result", CounterChangeConfig)
            Log.d("lifeCycle", "Click Button")
            startActivity(goIntent)
        }
    }

    /*override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        CounterChangeConfig += 1
        textView.text = CounterChangeConfig.toString()
        Log.d("lifeCycle", "OnConfigChanged")

    }*/

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("res",CounterChangeConfig)
    }
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val counter = savedInstanceState.getInt("res",0)
        CounterChangeConfig = counter + 1
        textView.text = CounterChangeConfig.toString()
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
