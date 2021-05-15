package com.example.kotlin

import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Gravity
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity(){

    override fun onCreate(abc:Bundle?) {
        super.onCreate(abc)
        setContentView(R.layout.activity_main)
      val toolbar = findViewById<Toolbar>(R.id.toolbar)
        toolbar.setTitle("Hello Kotlin")
        toolbar.setTitleTextColor(Color.WHITE)
        setSupportActionBar(toolbar)


      val listview = findViewById<ListView>(R.id.listview)
        val myarraylist = arrayOf<String>("Hemant","Lucky","Neetu","pooja","Prity","Beauty","arti","prakash","mainish","Mukul")
        val arrayAdapter : ArrayAdapter<String> = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,myarraylist)

        listview.adapter=arrayAdapter
        registerForContextMenu(listview)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater  = menuInflater
        inflater.inflate(R.menu.main_menu,menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
       return when(item !!.itemId){
           R.id.call ->{
               Toast.makeText(this,"call ",Toast.LENGTH_SHORT).show()
               return true
           }
           R.id.sms -> {
               Toast.makeText(this,"sms ",Toast.LENGTH_SHORT).show()
               return true
           }
           else -> super.onOptionsItemSelected(item)
       }
    }
}




