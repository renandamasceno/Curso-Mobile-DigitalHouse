package com.renan.nascimentoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.fragment_a.*
import kotlinx.android.synthetic.main.fragment_b.*

class MainActivity : AppCompatActivity(), IClicou {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.containerA, fragmentA())
            .commit()

        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.containerB, fragmentB())
        transaction.commit()

    }

    override fun clicar(texto: String, ano: Int) {

    }
}