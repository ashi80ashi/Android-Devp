package com.example.implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val camera = findViewById<CardView>(R.id.camera)
        val coca = findViewById<CardView>(R.id.cocacola)

        coca.setOnClickListener{
            val intent = Intent(Intent(Intent.ACTION_VIEW))
            intent.data = Uri.parse("https://cocacola-spinner.netlify.app/")
            startActivity(intent)
        }

        camera.setOnClickListener{
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }

    }
}