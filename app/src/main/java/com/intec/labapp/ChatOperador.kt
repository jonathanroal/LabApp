package com.intec.labapp

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ChatOperador : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_operador)

        val x = AlertDialog.Builder(this)
        x.setMessage(R.string.Chat)
        x.setTitle(R.string.ChatT)


        val enviar = findViewById<Button>(R.id.enviar)
        enviar.setOnClickListener{
            x.create().show()
        }

        val chatOperador = findViewById<Button>(R.id.chatOperador)
        chatOperador.setOnClickListener{
            val intent = Intent(this, ChatCoordinador::class.java)
            startActivity(intent)
        }


    }


}