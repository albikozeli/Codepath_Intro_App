package com.example.codepath_intro_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.GreetingButton)

        button.setOnClickListener {
            Log.v("Greeting", "Button Clicked")
            Toast.makeText(this, "Bloody Bella Ciao", Toast.LENGTH_LONG).show()
        }
    }
}