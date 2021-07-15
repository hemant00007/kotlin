package com.example.kotlin

import User
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity(){


    override fun onCreate(abc:Bundle?) {
        super.onCreate(abc)
        setContentView(R.layout.activity_main)
        val arrlist = ArrayList<User>()
        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        arrlist.add(User("hemant", "patna"))
        arrlist.add(User("hemant", "patna"))
        arrlist.add(User("hemant", "patna"))
        arrlist.add(User("hemant", "patna"))
        arrlist.add(User("hemant", "patna"))
        arrlist.add(User("hemant", "patna"))
        arrlist.add(User("hemant", "patna"))
        arrlist.add(User("hemant", "patna"))
        arrlist.add(User("hemant", "patna"))
        arrlist.add(User("hemant", "patna"))
        arrlist.add(User("hemant", "patna"))
        arrlist.add(User("hemant", "patna"))
        val adapter = CustomAdapter(arrlist)

        recyclerView.adapter = adapter
    }



}





