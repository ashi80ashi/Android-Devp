package com.example.studywalla

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val letsgo = findViewById<Button>(R.id.button)
        letsgo.setOnClickListener {
            val intent = Intent(applicationContext, List::class.java)
            startActivity(intent)
        }

    }
}