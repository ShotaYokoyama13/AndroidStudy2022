package com.example.listviewsample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lvMenu: ListView = findViewById(R.id.lvMenu)

        var menuList = mutableListOf("とまと", "きゅうり", "なす", "たまねぎ", "おくら", "さつまいも",
            "じゃがいも", "はくさい", "だいこん", "にんじん", "とうもろこし", "ぴーまん", "ねぎ", "にら")

        val adapter = ArrayAdapter(this@MainActivity, android.R.layout.simple_list_item_1, menuList)

        lvMenu.adapter = adapter

        lvMenu.onItemClickListener = ListItemClickListener()
    }
    private inner class ListItemClickListener : AdapterView.OnItemClickListener {
        override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            val dialogFragment = OrderComFilmDialogFragment()
            dialogFragment.show(supportFragmentManager, "OrderComFilmDialogListener")
        }
    }
}