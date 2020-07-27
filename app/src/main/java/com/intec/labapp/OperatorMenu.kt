package com.intec.labapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button

class OperatorMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.operator_menu)

        val buttonInst = findViewById<Button>(R.id.solicitarInst)
        buttonInst.setOnClickListener{
            val intent = Intent(this, SolicitarInstalacion::class.java)
            startActivity(intent)
        }
    }
}


