package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class FontSizeAdapter (private val context: Context,
                       private val fontSize: Array<Int>): BaseAdapter() {
    override fun getCount(): Int {
        return fontSize.size
    }

    override fun getItem(position: Int): Any {
        return fontSize[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView = TextView(context)

        textView.text = fontSize[position].toString()

        textView.textSize = fontSize[position].toFloat()

        textView.setPadding(5,10,8,10)

        return textView
    }

}