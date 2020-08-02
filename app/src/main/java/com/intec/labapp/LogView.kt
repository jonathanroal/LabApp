package com.intec.labapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_log_view.*


class LogView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_view)

        initComponents()


    }

    fun initComponents(){

        setSupportActionBar(logTitle)

        val logID = intent.getStringExtra("EXTRA_LOG_ID")
        val logText = findViewById<TextView>(R.id.logText)

        when (logID) {
            "1" ->{
                supportActionBar?.apply {
                    title = "Control del aire acondicionado"
                    logText.setText("El control remoto del aire acondicionado del miniauditorio se encuentra extraviado").toString()
                }
            }
            "2" ->{
                supportActionBar?.apply {
                    title = "Basura en el miniauditorio"
                    logText.setText("Estan dejando basura en el miniauditorio").toString()
                }
            }
            "3" ->{
                supportActionBar?.apply {
                    title = "Instalar SQL server lab 1"
                    logText.setText("Se necesita instalar SQL server en las computadoras del lab 1 para la clase de bases de datos 1").toString()
                }
            }
            else -> {
                //do nothing
            }
        }
    }
}
