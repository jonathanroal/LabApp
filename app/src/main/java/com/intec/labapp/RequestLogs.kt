package com.intec.labapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RequestLogs : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_request_logs)
        initComponents()
    }

    fun initComponents(){

        val buttonLog1 = findViewById<Button>(R.id.log1)
        buttonLog1.setOnClickListener{
            val intent = Intent(this, LogView::class.java)
            intent.putExtra("EXTRA_LOG_ID", "1") //Put your id to your next Intent
            startActivity(intent)
        }

        val buttonLog2 = findViewById<Button>(R.id.log2)
        buttonLog2.setOnClickListener{
            val intent = Intent(this, LogView::class.java)
            intent.putExtra("EXTRA_LOG_ID", "2") //Put your id to your next Intent
            startActivity(intent)
        }

        val buttonLog3 = findViewById<Button>(R.id.log3)
        buttonLog3.setOnClickListener{
            val intent = Intent(this, LogView::class.java)
            intent.putExtra("EXTRA_LOG_ID", "3") //Put your id to your next Intent
            startActivity(intent)
        }

    }
}
