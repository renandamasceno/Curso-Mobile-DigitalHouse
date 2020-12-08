package com.renan.excerciosharedpreferences

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val entrar = findViewById<Button>(R.id.btnLogin)
        val checkbox = findViewById<CheckBox>(R.id.checkbox1)
        val prefs = getSharedPreferences(APP_NAME, MODE_PRIVATE)

        val prefsChecked = prefs.getBoolean(NOTIFICATION_PREFS,false)


        checkbox.isChecked = prefsChecked

        checkbox.setOnCheckedChangeListener{ _,isChecked ->

            prefs.edit().putBoolean(NOTIFICATION_PREFS,isChecked).apply()

        }

        entrar.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)

        }

        if(checkbox.isChecked){
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }

    companion object{
        const val APP_NAME = "ex_prefs"
        const val NOTIFICATION_PREFS = "NOTIFICATION_PREFS"
    }
}