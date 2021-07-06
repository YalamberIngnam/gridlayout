package com.example.gridview.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.gridview.R
import com.example.gridview.data.LanguageItem

class LanguageAdapter( var context: Context, var arrayList: ArrayList<LanguageItem>): BaseAdapter(){
    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {
        return arrayList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View = View.inflate(context, R.layout.grid_item_list, null)
        var icon:ImageView = view.findViewById(R.id.imageviews)
        var name:TextView = view.findViewById(R.id.textviews)

        var languageItem: LanguageItem = arrayList.get(position)
        icon.setImageResource(languageItem.icons!!)
        name.text = languageItem.name
        return view
    }

}