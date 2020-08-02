package com.intec.labapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button

class OperatorMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operator_menu)

        val buttonInst = findViewById<Button>(R.id.solicitarInst)
        buttonInst.setOnClickListener{
            val intent = Intent(this, RequestInstallation::class.java)
            startActivity(intent)
        }

        val consultarOp = findViewById<Button>(R.id.consultarOp)
        consultarOp.setOnClickListener{
            val intent = Intent(this, InfoOperador::class.java)
            startActivity(intent)
        }

    }
}


