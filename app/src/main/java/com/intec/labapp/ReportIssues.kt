package com.intec.labapp

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ReportIssues : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report_issues)

        initComponents();

    }

    fun initComponents(){
        val titleText: EditText = findViewById(R.id.editTextIssue) as EditText
        titleText.setOnClickListener {
            if(!clickFlag){
                titleText.text.clear();
                clickFlag = true
            }
        }

        val x = AlertDialog.Builder(this)
        x.setMessage(R.string.Enviado)
        x.setTitle(R.string.EnviadoTitulo)

        val alert2 = AlertDialog.Builder(this)
        alert2.setMessage(R.string.SendPic)
        alert2.setTitle(R.string.Imagen)

        val send = findViewById<Button>(R.id.send)
        send.setOnClickListener{
            x.create().show()
            val issueText: EditText = findViewById(R.id.chatText) as EditText
            issueText.setText("")
            titleText.setText("")
        }

        val adj_pic = findViewById<Button>(R.id.adj_pic)
        adj_pic.setOnClickListener{
            alert2.create().show()
        }
    }
}