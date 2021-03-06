package com.renan.comunicacaoentrefragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), IClicou {
    val segundoFragment = SegundoFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manager = supportFragmentManager

        val transaction = manager.beginTransaction()
        transaction.add(R.id.container, MeuFragment())
        transaction.commit()


        val transaction2 = manager.beginTransaction()
        transaction2.add(R.id.segundoContainer, SegundoFragment())
        transaction2.commit()

    }

    override fun cliclou(texto: String) {
        txtPadrao.text = texto

        segundoFragment.mudarTexto(texto)
    }
}