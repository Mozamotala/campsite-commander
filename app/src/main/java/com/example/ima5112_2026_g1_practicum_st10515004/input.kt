//Mohamed Zaeem Motala
//St10515004
package com.example.ima5112_2026_g1_practicum_st10515004

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

        var quantitys = arrayOf("0","1","2","3","4","5")
        quantity.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, quantitys)

        var catagories = arrayOf("food","water","shelter")
        catagory.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, catagories)

        Addgear.setOnClickListener {
            if (item.text.toString().isEmpty()) {
                item.error = "Please enter an item"
                return@setOnClickListener
            }
            if (comment.text.toString().isEmpty()) {
                comment.error = "Please enter a comment"
                return@setOnClickListener
            }
            processor.addData(item.text.toString(), comment.text.toString(), quantity.selectedItem.toString().toInt(), catagory.selectedItemPosition)

            item.text.clear()
            comment.text.clear()
            quantity.setSelection(0)
            catagory.setSelection(0)

            if (processor.getCount() >=2) { // pls dont  forget t change this this  is only for testing

            }
            }
        Nextpage.setOnClickListener {
            startActivity(android.content.Intent(this, Detailspage::class.java))

        }
        clear.setOnClickListener {
            item.text.clear()
            comment.text.clear()
            quantity.setSelection(0)
            catagory.setSelection(0)
        }
    }




    }
