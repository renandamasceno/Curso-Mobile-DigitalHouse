package com.renan.nascimentoapp

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_a.*
import kotlinx.android.synthetic.main.fragment_a.view.*


class fragmentA : Fragment() {

    lateinit var iCLicou: IClicou
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_a, container, false)

        view.btnCalcular.setOnClickListener {
            iCLicou.clicar("ola",22)
        }

        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        var iClicou = context as IClicou
    }
}