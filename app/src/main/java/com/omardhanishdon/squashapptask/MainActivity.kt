package com.omardhanishdon.squashapptask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.PopupMenu
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = findViewById<RecyclerView>(R.id.list_item)

        val adapter = ListAdapter(this)
        list.layoutManager = GridLayoutManager(this , 3)
        list.adapter = adapter

        findViewById<ImageView>(R.id.menu).setOnClickListener {
            val popupMenu = PopupMenu(this , findViewById<ImageView>(R.id.menu))
            popupMenu.menuInflater.inflate(R.menu.main_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener {
                true
            }
            popupMenu.show()
        }
    }


}
