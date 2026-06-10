//Mohamed Zaeem Motala
//St10515004
package com.example.ima5112_2026_g1_practicum_st10515004

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val startButton = findViewById<Button>(R.id.Start) //this is the start button it will take you to the next screen
        val exitButton = findViewById<Button>(R.id.Exit) //this is the exit button it will exit the app


        startButton.setOnClickListener {//this is the start button it will take you to the next screen and wait for 3 seconds before transitioning to the next screen
            // Adding a 3-second delay (3000ms) before transitioning to the next screen
            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this, input::class.java)
                startActivity(intent)
            }, 3000)
        }
        exitButton.setOnClickListener {//this is the exit button it will exit the app
            moveTaskToBack(true)
            finish()
        }
    }
}
