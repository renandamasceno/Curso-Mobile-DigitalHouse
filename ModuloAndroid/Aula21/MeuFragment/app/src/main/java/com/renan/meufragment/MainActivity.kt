package com.renan.meufragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manager = supportFragmentManager


        btnAdicionaA.setOnClickListener {
            val transaction = manager.beginTransaction()
            transaction.replace(R.id.fragmentContainer, BlankFragment())
            transaction.commit()
        }

        btnAdicionaB.setOnClickListener{
            val transaction = manager.beginTransaction()
            transaction.replace(R.id.fragmentContainer, FragmentB())
            transaction.commit()
        }
    }
}