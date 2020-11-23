package com.renan.exrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val dataSet: List<Contatos>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val textoNome: TextView = view.findViewById(R.id.contactName)
        private val textoMensagem: TextView = view.findViewById(R.id.lastMessage)
        private val textoTempo: TextView = view.findViewById(R.id.timeStamp)

        fun bind(contatos: Contatos){
            textoNome.text = contatos.nome
            textoMensagem.text = contatos.message
            textoTempo.text = contatos.time
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_lista, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount() = dataSet.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(dataSet[position])
    }


}