package com.example.textview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val saludo:TextView = findViewById<TextView>(R.id.saludo) as TextView

        saludo.setOnClickListener {
            Toast.makeText(this@MainActivity, "hello", Toast.LENGTH_LONG).show()
        }
    }
}