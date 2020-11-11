package com.krause.navigationapp
import android.os.Bundle
import android.util.Log
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity

class FouthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fouth)


        val bigCheckBox: CheckBox = findViewById(R.id.checkbox_theater)

        bigCheckBox.setOnCheckedChangeListener { buttonView, isChecked ->
            Log.d("deanthonee", "Event just happened")

            if (isChecked) {
                //do something
                Log.d("deanthonee", " our answer is $isChecked")
                title = "Is On"
            } else {
                Log.d("deanthonee", " xoxoxoxox our answer is $isChecked")
                title = "Is Off"
            }
        }

        val bigRadioButton: RadioButton = findViewById(R.id.radio_theater)

        bigRadioButton.setOnCheckedChangeListener { buttonView, isClicked ->
            Log.d("Krausenburger", "Event just happened")

            if (isClicked) {
                //do something
                Log.d("Krausenburger", " homie, did they click? $isClicked")
                title = "Is On"
            } else {
                //do something else
                Log.d("Krausenburger", " I think so: $isClicked")
                title = "Is Off"

            }
        }

        val bigSwitchButton: Switch = findViewById(R.id.switch_theater)

        bigSwitchButton.setOnCheckedChangeListener { buttonView, isSwitched ->
            Log.d("Krausenburger", "Event just happened")

            if (isSwitched) {
                //do something
                Log.d("Krause", " homie, did they switch? $isSwitched")
                title = "Is On"
            } else {
                //do something else
                Log.d("Krause", " I this so: $isSwitched")
                title = "Is Off"

            }
        }

    }
}