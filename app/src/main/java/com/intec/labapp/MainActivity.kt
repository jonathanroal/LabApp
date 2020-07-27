package com.intec.labapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity)

        initComponents()

    }

    override fun onBackPressed() {
        // do something
    }

    fun initComponents(){
        val buttonOperator = findViewById<ImageButton>(R.id.operatorButton)
        buttonOperator.setOnClickListener{
            val intent = Intent(this, OperatorMenu::class.java)
            startActivity(intent)
        }

        val buttonLog = findViewById<ImageButton>(R.id.logButton)
        buttonLog.setOnClickListener{
            val intent = Intent(this, RequestLogs::class.java)
            startActivity(intent)
        }
    }
}
