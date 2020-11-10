package com.krause.navigationapp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox

class FouthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fouth)


        val bigCheckBox:CheckBox = findViewById(R.id.checkbox_theater)

        bigCheckBox.setOnCheckedChangeListener { buttonView, isChecked ->
            Log.d("deanthonee","Event just happened")

            if (isChecked){
                //do something
                Log.d("deanthonee"," our answer is $isChecked")
                title = "Is On"
            }
            else{
                Log.d("deanthonee"," xoxoxoxox our answer is $isChecked")
                title = "Is Off"
            }
        }
    }
}