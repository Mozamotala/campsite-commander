//Mohamed Zaeem Motala
//St10515004
package com.example.ima5112_2026_g1_practicum_st10515004

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class input : AppCompatActivity() {
    companion object {
        val processor = data()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var item = findViewById<EditText>(R.id.Item)
        var comment = findViewById<EditText>(R.id.comment)
        var quantity = findViewById<Spinner>(R.id.quantity)
        var catagory = findViewById<Spinner>(R.id.catagory)
        var Addgear = findViewById<Button>(R.id.Addgear)
        var Nextpage = findViewById<Button>(R.id.Nextpage)
        var clear = findViewById<Button>(R.id.clear)

        var quantitys = arrayOf("0", "1", "2", "3", "4", "5")
        // Using custom layout spinner_item for white text
        quantity.adapter = ArrayAdapter(this, R.layout.spinner_item, quantitys).apply {
            setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        }

        var catagories = arrayOf("food", "water", "shelter")
        // Using custom layout spinner_item for white text
        catagory.adapter = ArrayAdapter(this, R.layout.spinner_item, catagories).apply {
            setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        }

        Addgear.setOnClickListener {
            if (item.text.toString().isEmpty()) {
                item.error = "Please enter an item"
                return@setOnClickListener
            }
            if (comment.text.toString().isEmpty()) {
                comment.error = "Please enter a comment"
                return@setOnClickListener
            }
            processor.addData(
                item.text.toString(),
                comment.text.toString(),
                quantity.selectedItem.toString().toInt(),
                catagory.selectedItemPosition
            )

            item.text.clear()
            comment.text.clear()
            quantity.setSelection(0)
            catagory.setSelection(0)

            if (processor.getCount() == 10) {
                android.widget.Toast.makeText(
                    this,
                    "You have reached the maximum number of items",
                    android.widget.Toast.LENGTH_SHORT
                ).show()

            }
        }
        Nextpage.setOnClickListener {
            if (processor.getCount() == 0) {
                android.widget.Toast.makeText(
                    this,
                    "Please enter some data first",
                    android.widget.Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            } else {
                val intent = Intent(this, Detailspage::class.java)
                startActivity(intent)

            }

        }
        clear.setOnClickListener {
            item.text.clear()
            comment.text.clear()
            quantity.setSelection(0)
            catagory.setSelection(0)
        }
    }
}
