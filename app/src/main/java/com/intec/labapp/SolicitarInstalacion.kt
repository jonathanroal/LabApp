package com.intec.labapp

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import kotlinx.android.synthetic.main.activity_solicitar_instalacion.*

class SolicitarInstalacion : AppCompatActivity() {

    var clickFlag = false;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_solicitar_instalacion)

        initView()

    }

    fun initView(){

        val titleText: EditText = findViewById(R.id.editText) as EditText
        titleText.setOnClickListener {
            if(!clickFlag){
                titleText.text.clear();
                clickFlag = true
            }
        }

        val buttonEnviar = findViewById<Button>(R.id.enviar)
        buttonEnviar.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
            val descContent = descriptionText.text.toString()
            if (descContent == ""){

            }
            else {

                createNotificationChannel()

                var builder = NotificationCompat.Builder(this, "1")
                    .setSmallIcon(R.drawable.person_calendar)
                    .setContentTitle("Solicitud enviada")
                    .setContentText("Tu solicitud a sido enviada con exito!")
                    .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                    .setAutoCancel(true)

                with(NotificationManagerCompat.from(this)) {
                    // notificationId is a unique int for each notification that you must define
                    notify(1, builder.build())
                }

                startActivity(intent);
            }
        }
    }

    private fun createNotificationChannel() {
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
    }
}
