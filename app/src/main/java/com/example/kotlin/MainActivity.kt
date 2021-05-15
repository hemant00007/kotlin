package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity(){
    override fun onCreate(abc:Bundle?){
        super.onCreate(abc)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
      menuInflater.inflate(R.menu.menutwo,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.setting -> {
                Toast.makeText(applicationContext,"setting clicked",Toast.LENGTH_SHORT).show()
                true
            }
            R.id.share -> {
                Toast.makeText(applicationContext,"Share clicked",Toast.LENGTH_SHORT).show()
                true
            }
            R.id.exit -> {
                Toast.makeText(applicationContext,"Exit clicked",Toast.LENGTH_SHORT).show()
                true
            }
            R.id.profile -> {
                Toast.makeText(applicationContext,"Profile clicked",Toast.LENGTH_SHORT).show()
                true
            }
            else -> {
                Toast.makeText(applicationContext,"Nothing  clicked",Toast.LENGTH_SHORT).show()
                true
            }
        }
    }
}




