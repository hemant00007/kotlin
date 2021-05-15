package com.example.kotlin

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class MyListadapter(private val context: Activity,private val title:Array<String>,private val desc:Array<String>,private val
imagelist : Array<Int>) : ArrayAdapter<String>(context,R.layout.custom_list,title){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater = context.layoutInflater
        val rowview = inflater.inflate(R.layout.custom_list,null,true)

        val titletext = rowview.findViewById(R.id.title) as TextView
        val imageview = rowview.findViewById(R.id.icon) as ImageView
        val subtitleText = rowview.findViewById(R.id.description) as TextView

        titletext.text=title[position]
        imageview.setImageResource(imagelist[position])
        subtitleText.text = desc[position]
        return rowview
    }
}