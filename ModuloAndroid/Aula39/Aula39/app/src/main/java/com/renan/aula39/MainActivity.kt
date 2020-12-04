package com.renan.aula39

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.renan.aula39.cartao.view.CartaoFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment, CartaoFragment())
            .commit()
    }
}