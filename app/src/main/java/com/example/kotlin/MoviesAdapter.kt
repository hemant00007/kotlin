package com.example.kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

internal  class MoviesAdapter (private  var movieslist: List<Model>) : RecyclerView.Adapter<MoviesAdapter.MyViewHolder>(){

    internal  inner  class  MyViewHolder(view: View) : RecyclerView.ViewHolder(view){

        var title : TextView = view.findViewById(R.id.title)
        var year : TextView = view.findViewById(R.id.year)
        var genre : TextView = view.findViewById(R.id.genre)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
      var itemview = LayoutInflater.from(parent.context)
              .inflate(R.layout.item_row,parent,false)
        return MyViewHolder(itemview)
    }

    override fun getItemCount(): Int {
      return movieslist.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
      val movie = movieslist[position]
        holder.title.text= movie.getTitle()
        holder.genre.text=movie.getGenre()
        holder.year.text=movie.getYear()
    }


}