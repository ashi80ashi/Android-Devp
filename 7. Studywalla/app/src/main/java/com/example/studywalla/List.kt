package com.example.studywalla

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class List : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)


        val btn1 = findViewById<Button>(R.id.button1)
        btn1.setOnClickListener{
            val intent = Intent(Intent(Intent.ACTION_VIEW))
            intent.data = Uri.parse("https://www.w3schools.com/")
            startActivity(intent)
        }

        val btn2 = findViewById<Button>(R.id.button2)
        btn2.setOnClickListener{
            val intent = Intent(Intent(Intent.ACTION_VIEW))
            intent.data = Uri.parse("https://www.pwskills.com/")
            startActivity(intent)
        }

        val btn3 = findViewById<Button>(R.id.button3)
        btn3.setOnClickListener{
            val intent = Intent(Intent(Intent.ACTION_VIEW))
            intent.data = Uri.parse("https://www.thecodehelp.in/")
            startActivity(intent)
        }

        val btn4= findViewById<Button>(R.id.button4)
        btn4.setOnClickListener{
            val intent = Intent(Intent(Intent.ACTION_VIEW))
            intent.data = Uri.parse("https://www.javatpoint.com/")
            startActivity(intent)
        }

        val btn5= findViewById<Button>(R.id.button5)
        btn5.setOnClickListener{
            val intent = Intent(Intent(Intent.ACTION_VIEW))
            intent.data = Uri.parse("https://www.udemy.com/")
            startActivity(intent)
        }
        val btn6= findViewById<Button>(R.id.button6)
        btn6.setOnClickListener{
            val intent = Intent(Intent(Intent.ACTION_VIEW))
            intent.data = Uri.parse("https://testbook.com/")
            startActivity(intent)
        }
        val btn7= findViewById<Button>(R.id.button7)
        btn7.setOnClickListener{
            val intent = Intent(Intent(Intent.ACTION_VIEW))
            intent.data = Uri.parse("https://in.coursera.org/")
            startActivity(intent)
        }
        val btn8= findViewById<Button>(R.id.button8)
        btn8.setOnClickListener{
            val intent = Intent(Intent(Intent.ACTION_VIEW))
            intent.data = Uri.parse("https://code.org/")
            startActivity(intent)
        }

        val btn10= findViewById<Button>(R.id.button10)
        btn10.setOnClickListener{
            val intent = Intent(Intent(Intent.ACTION_VIEW))
            intent.data = Uri.parse("https://www.linkedin.com/in/ashish-singh-93a163215")
            startActivity(intent)
        }

    }
}