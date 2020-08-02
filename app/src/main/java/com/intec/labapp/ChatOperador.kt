package com.intec.labapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_chat_operador.*

var clickFlag = false;

class ChatOperador : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_operador)

        initComponents();

    }

    fun initComponents(){

        val sendText: EditText = findViewById(R.id.sendText) as EditText
        sendText.setOnClickListener {
            if(!clickFlag){
                sendText.text.clear();
                clickFlag = true
            }
        }

        val chatOperador = findViewById<Button>(R.id.chatOperador)
        chatOperador.setOnClickListener{
            chatOperador.isVisible = false;
            setSupportActionBar(chatTitle);
            supportActionBar?.apply {
                title = "Chat Coordinador"
            }
        }

        val botonEnviar = findViewById<Button>(R.id.sendButton)
        botonEnviar.setOnClickListener{
            val str: String = sendText.text.toString()
            if(str==""){
                //do nothing
            }
            else{
                sendText.setText("");
                val chatText: EditText = findViewById(R.id.chatText) as EditText
                val cStr: String = chatText.text.toString()
                if(cStr==""){
                    chatText.setText(cStr + "Yo: " + str)
                }
                else{
                    chatText.setText(cStr + "\nYo: " + str)
                }

            }
        }

    }



}