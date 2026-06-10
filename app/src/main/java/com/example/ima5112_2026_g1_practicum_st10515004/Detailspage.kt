//St10515004
//Mohamed Zaeem Motala
package com.example.ima5112_2026_g1_practicum_st10515004

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Detailspage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val MainScreenBtn = findViewById<Button>(R.id.MainScreenBtn)
        val answers = findViewById<TextView>(R.id.Answers)


        MainScreenBtn.setOnClickListener {
            startActivity(android.content.Intent(this, MainActivity::class.java))
        }


        answers.text = input.processor.getData()
    }
    }
