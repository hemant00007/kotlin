package com.example.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(){
    override fun onCreate(abc:Bundle?) {
        super.onCreate(abc)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener(){
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}




