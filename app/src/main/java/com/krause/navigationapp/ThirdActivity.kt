package com.krause.navigationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val bigButton: Button = findViewById(R.id.third_button)

        bigButton.setOnClickListener {
            val intent = Intent(this,FouthActivity::class.java)
            startActivity(intent)

        }
    }
}