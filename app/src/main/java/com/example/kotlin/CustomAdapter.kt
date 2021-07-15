package com.example.kotlin

import User
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val arrayList: ArrayList<User>): RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    class ViewHolder(itemview:View):RecyclerView.ViewHolder(itemview){
        fun bindItems(user: User){
           val username =itemView.findViewById(R.id.textViewUsername) as TextView
            val address = itemView.findViewById(R.id.textViewAddress) as TextView
            username.text=user.name
            address.text=user.address
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val  v = LayoutInflater.from(parent.context).inflate(R.layout.itemview,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
   holder.bindItems(arrayList[position])
    }
}