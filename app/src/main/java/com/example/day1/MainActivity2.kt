package com.example.day1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val mail = findViewById<EditText>(R.id.et3)
        val un = findViewById<EditText>(R.id.et1)
        val pn = findViewById<EditText>(R.id.et2)
        val pw = findViewById<EditText>(R.id.et4)
    }

}