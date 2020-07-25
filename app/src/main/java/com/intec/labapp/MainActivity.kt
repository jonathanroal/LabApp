package com.intec.labapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import kotlinx.android.synthetic.main.menu.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)

        val buttonOperator = findViewById<ImageButton>(R.id.operatorButton)

        buttonOperator.setOnClickListener{
            val intent = Intent(this, OperatorMenu::class.java)
            startActivity(intent)
        }
    }
}
