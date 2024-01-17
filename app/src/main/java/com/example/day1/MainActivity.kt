package com.example.day1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1 = findViewById<Button>(R.id.button)
        val input1 = findViewById<EditText>(R.id.edt1)
        val input2 = findViewById<EditText>(R.id.edt2)
        val btn2 = findViewById<Button>(R.id.button2)
        btn1.setOnClickListener {
            val str = input1.text.toString()
            val str1 = input2.text.toString()
            val si = Intent(this,MainActivity3::class.java).putExtra("inputx",str)
            val ed = Intent(this,MainActivity3::class.java).putExtra("inputy",str1)
            startActivity(si)
            startActivity(ed)
            finish()
        }
        btn2.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}