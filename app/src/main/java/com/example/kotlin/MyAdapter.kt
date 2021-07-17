package com.example.kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val details:ArrayList<User>): RecyclerView.Adapter<MyAdapter.DetailsHolder>() {


    class DetailsHolder(val itemview:View):RecyclerView.ViewHolder(itemview){

        val  username = itemview.findViewById(R.id.textViewUsername)as TextView
        val  mobile = itemview.findViewById(R.id.textViewmobile) as TextView
        val address = itemview.findViewById(R.id.textViewAddress) as TextView
        fun redundant(user :User){
            username.text = user.name
            mobile.text= user.Mobile
            address.text=user.Address
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailsHolder {

        val v =LayoutInflater.from(parent.context).inflate(R.layout.itemview,parent,false)
        return DetailsHolder(v)

    }

    override fun onBindViewHolder(holder: DetailsHolder, position: Int) {
      holder.redundant( details[position])
    }

    override fun getItemCount(): Int {
       return details.size
    }

}
