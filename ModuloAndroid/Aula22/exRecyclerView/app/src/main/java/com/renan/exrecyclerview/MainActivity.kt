package com.renan.exrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewManager = LinearLayoutManager(this)
        val recyclerView = findViewById<RecyclerView>(R.id.minhaLista)
        val viewAdapter = MyAdapter(arrayListOf(Contatos("Renan","Olá amigo!","19:33"), Contatos("Felipe","Olá professor","5:33")))

        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }

    }
}