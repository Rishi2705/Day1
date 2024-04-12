package com.example.day1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.button)
        val input1 = findViewById<EditText>(R.id.edt1)
        val btn2 = findViewById<Button>(R.id.button2)
        val input2 = findViewById<EditText>(R.id.edt2)
        btn.setOnClickListener {
            val str1 = input1.text.toString()
            val str2 = input2.text.toString()
            val count1 : Int = str1.length
            val count2 : Int = str2.length
            if (count1 == 0 || count2 == 0) {
                if (count1 == 0)
                    Toast.makeText(this@MainActivity, "email id cannot be blank", Toast.LENGTH_SHORT).show()
                if (count2 == 0)
                    Toast.makeText(this@MainActivity, "Password is mandatory", Toast.LENGTH_SHORT).show()
            }else {
                val si = Intent(this, MainActivity3::class.java).putExtra("input", str1)
                startActivity(si)
                finish()
            }
        }
        btn2.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}