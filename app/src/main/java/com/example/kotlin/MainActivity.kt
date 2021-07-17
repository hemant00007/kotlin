package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity(){

        val datalist =ArrayList<User>()
         override fun onCreate(abc:Bundle?) {
        super.onCreate(abc)
        setContentView(R.layout.activity_main)
        val  recyclerview =findViewById(R.id.recyclerView) as RecyclerView
        recyclerview.layoutManager=LinearLayoutManager(this)

            datalist.add(User("hemant","8210771639","Rajapur Patna"))
            datalist.add(User("hemant","8210771639","Rajapur Patna"))
            datalist.add(User("hemant","8210771639","Rajapur Patna"))
            datalist.add(User("hemant","8210771639","Rajapur Patna"))
            datalist.add(User("hemant","8210771639","Rajapur Patna"))
            datalist.add(User("hemant","8210771639","Rajapur Patna"))
            datalist.add(User("hemant","8210771639","Rajapur Patna"))
            datalist.add(User("hemant","8210771639","Rajapur Patna"))
            datalist.add(User("hemant","8210771639","Rajapur Patna"))
            datalist.add(User("hemant","8210771639","Rajapur Patna"))
            datalist.add(User("hemant","8210771639","Rajapur Patna"))
            datalist.add(User("hemant","8210771639","Rajapur Patna"))
            datalist.add(User("hemant","8210771639","Rajapur Patna"))
            datalist.add(User("hemant","8210771639","Rajapur Patna"))
            datalist.add(User("hemant","8210771639","Rajapur Patna"))
            datalist.add(User("hemant","8210771639","Rajapur Patna"))
            datalist.add(User("hemant","8210771639","Rajapur Patna"))
            datalist.add(User("hemant","8210771639","Rajapur Patna"))
            val adapters =MyAdapter(datalist)
            recyclerview.adapter=adapters

        }
    }









