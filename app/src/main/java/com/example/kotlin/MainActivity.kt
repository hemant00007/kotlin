package com.example.kotlin


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView


class MainActivity : AppCompatActivity(){

    override fun onCreate(abc:Bundle?) {
        super.onCreate(abc)
        setContentView(R.layout.activity_main)
        val listitem = findViewById<ListView>(R.id.listview)
        val language = arrayOf<String>("c","java","Php","flutter","kotlin","laravel","RXjava","c","java","Php","flutter","kotlin","RXjava")
        val desc = arrayOf<String>(
            "C programming is considered as the base for other programming languages",
            "C++ is an object-oriented programming language.",
            "Java is a programming language and a platform.",
            ".NET is a framework which is used to develop software applications.",
            "Kotlin is a open-source programming language, used to develop Android apps and much more.",
            "Ruby is an open-source and fully object-oriented programming language.",
            "Ruby on Rails is a server-side web application development framework written in Ruby language.",
            "Python is interpreted scripting  and object-oriented programming language.",
            "JavaScript is an object-based scripting language.",
            "PHP is an interpreted language, i.e., there is no need for compilation.",
            "AJAX allows you to send and receive data asynchronously without reloading the web page.",
            "Perl is a cross-platform environment used to create network and server-side applications.",
            "Hadoop is an open source framework from Apache written in Java."
        )
        val imagelist = arrayOf<Int>(
            R.drawable.tree,R.drawable.treetwo,R.drawable.pine,
            R.drawable.tree,R.drawable.treetwo,R.drawable.pine,
            R.drawable.tree,R.drawable.treetwo,R.drawable.pine,
            R.drawable.tree,R.drawable.treetwo,R.drawable.pine,
            R.drawable.tree
        )
        val mylistadapter = MyListadapter(this,language,desc,imagelist)
        listitem.adapter= mylistadapter
    }
}




