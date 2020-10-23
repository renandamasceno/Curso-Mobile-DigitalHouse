package com.renan.conversor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnConverter.setOnClickListener {
            val tempEmC = edtTemp.text.toString().toInt()
            txtResultado.text = convert(tempEmC).toString() + "ºF"
        }
    }

    fun convert(tempAtual: Int): Int {
        return ((tempAtual * 9 ) / 5) + 32
    }
}