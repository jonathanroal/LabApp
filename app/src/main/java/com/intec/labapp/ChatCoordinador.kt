package com.intec.labapp

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ChatCoordinador : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_coordinador)

        val x = AlertDialog.Builder(this)
        x.setMessage(R.string.Chat)
        x.setTitle(R.string.ChatT)


        val enviar = findViewById<Button>(R.id.enviar)
        enviar.setOnClickListener{
            x.create().show()
        }
    }
}