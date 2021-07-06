package com.example.gridview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import com.example.gridview.adapters.LanguageAdapter
import com.example.gridview.data.LanguageItem

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener{

    private var gridView: GridView? = null
    private var arrayList:ArrayList<LanguageItem> ? = null
    private var languageAdapter: LanguageAdapter ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // gets the xml of the grid view
        gridView = findViewById(R.id.gridview)
        arrayList = ArrayList()
        arrayList = setDataList()
        languageAdapter = LanguageAdapter(applicationContext, arrayList!!)
        gridView?.adapter = languageAdapter
    }

    private fun setDataList(): ArrayList<LanguageItem>{

        var arrayList:ArrayList<LanguageItem> = ArrayList()
        arrayList.add(LanguageItem(R.drawable.sofa1, "Luxary HandMade sofa"))
        arrayList.add(LanguageItem(R.drawable.sofa2, "Velvet sofa handmade"))
        arrayList.add(LanguageItem(R.drawable.sofa3, "Four seater sofa"))
        arrayList.add(LanguageItem(R.drawable.sofa4, "Dont sofa"))
        arrayList.add(LanguageItem(R.drawable.sofa5, "Luxary HandMade sofa"))
        arrayList.add(LanguageItem(R.drawable.sofa6, "Luxary HandMade sofa"))
        arrayList.add(LanguageItem(R.drawable.sofa7, "Luxary HandMade sofa"))
        arrayList.add(LanguageItem(R.drawable.sofa8, "Luxary HandMade sofa"))
        arrayList.add(LanguageItem(R.drawable.sofa9, "Luxary HandMade sofa"))
        arrayList.add(LanguageItem(R.drawable.sofa10, "Luxary HandMade sofa"))

        return arrayList
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        when(position){
            1 -> startActivites("Sofa1Activity")
            2 -> startActivites("Sofa2Activity")
            3 -> startActivites("Sofa3Activity")
            4 -> startActivites("Sofa4Activity")
            5 -> startActivites("Sofa5Activity")
            6 -> startActivites("Sofa6Activity")
            7 -> startActivites("Sofa7Activity")
            8 -> startActivites("Sofa8Activity")
            9 -> startActivites("Sofa9Activity")
            else -> {

            }
        }
    }

    private fun startActivites(activtyName:String){
        val intent = Intent(this, activtyName::class.java)
        startActivity(intent)
    }
}