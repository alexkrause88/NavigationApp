package com.krause.navigationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bigButton:Button = findViewById(R.id.main_button)
        val cabage:TextView=findViewById(R.id.main_title_textview)
        val roomNumberInput:EditText=findViewById(R.id.main_room_number_input)


        bigButton.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }

        cabage.setOnClickListener{
            val roomNumber = roomNumberInput.text.toString()
            Toast.makeText(this@MainActivity,"your room # is $roomNumber",Toast.LENGTH_LONG).show()
        }
    }
}