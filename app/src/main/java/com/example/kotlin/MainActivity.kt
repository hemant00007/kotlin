package com.example.kotlin

import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.*
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity(){

    override fun onCreate(abc:Bundle?) {
        super.onCreate(abc)
        setContentView(R.layout.activity_main)

        val btn= findViewById<Button>(R.id.alert)
        btn.setOnClickListener(){
            val builder = AlertDialog.Builder(this)
            builder.setTitle("My Dialog")
            builder.setMessage("This is message")
            builder.setIcon(android.R.drawable.btn_dialog)
            builder.setPositiveButton("Yes"){
                dialog: DialogInterface?, which: Int ->
                Toast.makeText(this,"cliced yes",Toast.LENGTH_SHORT).show()
            }
            builder.setNegativeButton("No"){
                dialog: DialogInterface?, which: Int ->
                Toast.makeText(this,"clicked No",Toast.LENGTH_SHORT).show()
            }
            val alertdialo : AlertDialog = builder.create()
            alertdialo.setCancelable(true)
            alertdialo.show()

        }



    }
}




