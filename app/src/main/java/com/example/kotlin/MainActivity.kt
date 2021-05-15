package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(){
    override fun onCreate(abc:Bundle?){
        super.onCreate(abc)
        setContentView(R.layout.activity_main)
     val edttext = findViewById<EditText>(R.id.ed)
        val button = findViewById<Button>(R.id.submit)

        button.setOnClickListener(){
            val mystring = edttext.text.toString()
            Toast.makeText(applicationContext,mystring,Toast.LENGTH_SHORT).show()
        }
    }
}




