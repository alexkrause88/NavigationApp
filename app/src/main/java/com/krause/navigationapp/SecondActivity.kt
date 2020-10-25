package com.krause.navigationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bigButton: Button = findViewById(R.id.second_button)

        bigButton.setOnClickListener {
            val intent = Intent(this,ThirdActivity::class.java)
            startActivity(intent)

        }

    }
}