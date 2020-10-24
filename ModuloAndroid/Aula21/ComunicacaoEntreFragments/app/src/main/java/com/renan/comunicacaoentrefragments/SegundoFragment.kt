package com.renan.comunicacaoentrefragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_segundo.view.*


class SegundoFragment : Fragment() {

    lateinit var minhaView: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val minhaView = inflater.inflate(R.layout.fragment_segundo, container, false)

        return minhaView
    }

    fun mudarTexto(texto:String){
        minhaView.txtSegundoFragment.text = texto
    }


}