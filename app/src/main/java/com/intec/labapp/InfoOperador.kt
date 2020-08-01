package com.intec.labapp

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class InfoOperador : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_operador)

        val x = AlertDialog.Builder(this)
        x.setMessage(R.string.IniciaLlamada)
        x.setTitle(R.string.Contactar)


        val contactar = findViewById<Button>(R.id.contactar)
        contactar.setOnClickListener{
            x.create().show()
        }
    }
}