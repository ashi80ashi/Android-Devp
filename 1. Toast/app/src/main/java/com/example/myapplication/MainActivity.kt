package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val download = findViewById<Button>(R.id.btndownload)
        val upload = findViewById<Button>(R.id.btnupload)

        download.setOnClickListener {
            Toast.makeText(applicationContext, "downloading...", Toast.LENGTH_SHORT).show()
        }

        upload.setOnClickListener {
            Toast.makeText(applicationContext,"uploading...",Toast.LENGTH_SHORT).show()
        }


    }
}