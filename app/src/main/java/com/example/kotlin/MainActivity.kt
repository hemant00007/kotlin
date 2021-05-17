package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity(){
    private val movielist = ArrayList<Model>()
    private lateinit var moviesAdapter: MoviesAdapter

    override fun onCreate(abc:Bundle?){
        super.onCreate(abc)
        setContentView(R.layout.activity_main)
  //  val recyclerview : Recy
      //  https://www.tutorialspoint.com/working-with-recyclerview-in-an-android-app-using-kotlin
        val recyclerview : RecyclerView = findViewById(R.id.recyclerview)
        //set adapter
          moviesAdapter = MoviesAdapter(movielist)
        val layoutmanager = LinearLayoutManager(applicationContext)
        recyclerview.layoutManager = layoutmanager
        recyclerview.itemAnimator = DefaultItemAnimator()
   recyclerview.adapter= moviesAdapter
        prepareMovieData()
    }

    private fun prepareMovieData() {
        var movie = Model("Mad Max: Fury Road", "Action & Adventure", "2015")
        movielist.add(movie)
        movie = Model("Inside Out", "Animation, Kids & Family", "2015")
        movielist.add(movie)
        movie = Model("Star Wars: Episode VII - The Force Awakens", "Action", "2015")
        movielist.add(movie)
        movie = Model("Shaun the Sheep", "Animation", "2015")
        movielist.add(movie)
        movie = Model("The Martian", "Science Fiction & Fantasy", "2015")
        movielist.add(movie)
        movie = Model("Mission: Impossible Rogue Nation", "Action", "2015")
        movielist.add(movie)
        movie = Model("Up", "Animation", "2009")
        movielist.add(movie)
        movie = Model("Star Trek", "Science Fiction", "2009")
        movielist.add(movie)
        movie = Model("The LEGO MovieModel", "Animation", "2014")
        movielist.add(movie)
        movie = Model("Iron Man", "Action & Adventure", "2008")
        movielist.add(movie)
        movie = Model("Aliens", "Science Fiction", "1986")
        movielist.add(movie)
        movie = Model("Chicken Run", "Animation", "2000")
        movielist.add(movie)
        movie = Model("Back to the Future", "Science Fiction", "1985")
        movielist.add(movie)
        movie = Model("Raiders of the Lost Ark", "Action & Adventure", "1981")
        movielist.add(movie)
        movie = Model("Goldfinger", "Action & Adventure", "1965")
        movielist.add(movie)
        movie = Model("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014")
        movielist.add(movie)
      moviesAdapter.notifyDataSetChanged()

    }
}





