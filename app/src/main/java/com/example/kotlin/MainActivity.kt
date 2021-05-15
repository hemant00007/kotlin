package com.example.kotlin

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.*

class MainActivity : AppCompatActivity(){

    override fun onCreate(abc:Bundle?) {
        super.onCreate(abc)
        setContentView(R.layout.activity_main)
        val arraydata = arrayOf("hemant","Lucky","vikash","amit","hemant","Lucky","vikash","amit","hemant","Lucky","vikash","amit")
       val country_array:Array<String> = resources.getStringArray(R.array.country)
        val arrayAdapter= ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arraydata)


       val listView = findViewById<ListView>(R.id.listView)

        listView.adapter=arrayAdapter
        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this,arraydata[position],Toast.LENGTH_SHORT).show()
        }


    }
}




