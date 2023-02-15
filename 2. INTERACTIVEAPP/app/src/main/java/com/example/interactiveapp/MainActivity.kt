package com.example.interactiveapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dark = findViewById<Button>(R.id.dark)
        val light = findViewById<Button>(R.id.light)
        val layout = findViewById<LinearLayout>(R.id.linearlayout)
        dark.setOnClickListener {
            layout.setBackgroundResource(R.color.purple_700)
        }
        light.setOnClickListener {
            layout.setBackgroundResource(R.color.purple_200)
        }

    }
}