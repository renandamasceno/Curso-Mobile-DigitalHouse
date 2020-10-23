package com.renan.obtendoelementos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnClicou.setOnClickListener {
            val numero = edtNumero.text.toString().toInt()

            if(ehPar(numero) == true) {
                txtResultado.text = getString(R.string.mensagem_par)
            } else{
                txtResultado.text = getString(R.string.mensagem_impar)
            }

        }

    }
    fun ehPar(numero: Int): Boolean {
        return numero % 2 == 0
    }
}