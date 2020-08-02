package com.intec.labapp

import android.app.AlertDialog
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RequestInstallation : AppCompatActivity() {

    var clickFlag = false;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_request_installation)

        initComponents()

    }

    fun initComponents(){

        val titleText: EditText = findViewById(R.id.editText) as EditText
        titleText.setOnClickListener {
            if(!clickFlag){
                titleText.text.clear();
                clickFlag = true
            }
        }

        val builder = AlertDialog.Builder(this)
        builder.setMessage(R.string.Enviado)
        builder.setTitle(R.string.EnviadoTitulo)

        val buttonEnviar = findViewById<Button>(R.id.sendButton)
        buttonEnviar.setOnClickListener{

            val issueText: EditText = findViewById(R.id.chatText) as EditText
            val mainStr: String =titleText.text.toString()
            val issueStr: String = issueText.text.toString()
            if(mainStr==""||issueStr==""){
                //do nothing
            }
            else{
                builder.create().show()
                issueText.setText("")
                titleText.setText("")
            }

        }
    }

    /*private fun createNotificationChannel() {
        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = "Request Sent"
            val descriptionText = "Request has been sent"
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel("1", name, importance).apply {
                description = "Request sent"
            }
            // Register the channel with the system
            val notificationManager: NotificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }*/
}
