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
        val Exit = findViewById<Button>(R.id.Exit)


        Exit.setOnClickListener {
            moveTaskToBack(true)
            finish()
        }

        MainScreenBtn.setOnClickListener {
            startActivity(android.content.Intent(this, MainActivity::class.java))
        }


        answers.text = input.processor.getData() + "\n" +
                "Total Quantity: " + input.processor.getTotal()
        if (input.processor.getCount() <= 2) {
            answers.text = answers.text.toString() + "\n" +
                    "you shoud add more items be prepared "

        }
        if (input.processor.getCount() <= 5) {
            answers.text = answers.text.toString() + "\n" +
                    "are you sure thats enough items rather more than not enough"
        }
        if (input.processor.getCount() == 10) {
            answers.text = answers.text.toString() + "\n" +
                    "you are well prepared "
        }
    }
}
