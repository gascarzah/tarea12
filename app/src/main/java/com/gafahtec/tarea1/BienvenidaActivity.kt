package com.gafahtec.tarea1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_bienvenida.*

class BienvenidaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida)

        var welcomeList = mutableListOf("Bienvenido","Welcome","Bienvenue","Benvenuto","willkommen")
        
        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, welcomeList)
        
        welcome_gridview.adapter = adapter
        
        welcome_gridview.onItemClickListener = object : AdapterView.OnItemClickListener {
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val item = view as TextView
                item.setBackgroundColor(resources.getColor(R.color.colorPrimaryDark))
                item.setTextColor(resources.getColor(android.R.color.white))
            }

        }
    }
}
