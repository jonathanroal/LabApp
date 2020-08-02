package com.intec.labapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

var pos = 0;

class LabSchedule : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab_schedule)
        initComponents()
    }

    fun initComponents(){

        val labInfo: EditText= findViewById(R.id.labInfo)
        labInfo.isEnabled = false

        val spinner: Spinner = findViewById(R.id.daysSpinner)
        ArrayAdapter.createFromResource(
            this,
            R.array.days,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                //do nothing
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                setLabText()
            }

        }


        val leftButton: Button = findViewById(R.id.leftButton)
        leftButton.setOnClickListener {
            if(pos==0){
                //do nothing
            }
            else{
                pos-=1
                setLabText()
            }
        }

        val rightButton: Button = findViewById(R.id.rightButton)
        rightButton.setOnClickListener {
            if(pos==2){
                //do nothing
            }
            else{
                pos+=1
                setLabText()
            }
        }

    }

    fun setLabText(){
        val spinner: Spinner = findViewById(R.id.daysSpinner)
        val day = spinner.selectedItem.toString()
        val labText: TextView = findViewById(R.id.labText)
        val labInfo: EditText= findViewById(R.id.labInfo)
        when(pos){
            0 -> {
                labText.setText("Lab 1")
                if(day == "Martes"){
                    labInfo.setText("No esta disponible a las 3pm :(")
                }
                else{
                    labInfo.setText("Información del laboratorio")
                }
            }
            1 -> {
                labText.setText("Lab 2")
                labInfo.setText("Información del laboratorio")
            }
            2 -> {
                labText.setText("Miniauditorio")
                labInfo.setText("Información del laboratorio")
            }
        }
    }
}
