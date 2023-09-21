package edu.temple.inclassuiacvitivity

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class FontSizeAdapter (private val fontSize: Array<Int>): BaseAdapter() {
    override fun getCount(): Int {
        return fontSize.size
    }

    override fun getItem(position: Int): Any {
        TODO("Not yet implemented")
    }

    override fun getItemId(position: Int): Long {
        TODO("Not yet implemented")
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        TODO("Not yet implemented")
    }

}