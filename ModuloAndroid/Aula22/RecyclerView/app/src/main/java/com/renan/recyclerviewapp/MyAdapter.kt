package com.renan.recyclerviewapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val dataSet: List<String>): RecyclerView.Adapter<MyAdapter.MeuViewHolder>() {

    class MeuViewHolder(view: View): RecyclerView.ViewHolder(view){
        private val meuTexto : TextView = view.findViewById(R.id.myText)

        fun bind(string: String){
            meuTexto.text = string
        }
    }

    //inflar o xml(a linha)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MeuViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_lista, parent, false)

        return MeuViewHolder(view)
    }

    //quantidade de itens do meu DataSet
    override fun getItemCount() = dataSet.size
    //vai ser chamado a cada item do DataSet
    override fun onBindViewHolder(holder: MeuViewHolder, position: Int) {
       holder.bind(dataSet[position])
    }

}