package com.krause.navigationapp
import android.os.Bundle
import android.util.Log
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity

class FouthActivity : AppCompatActivity() {

    lateinit var bigCheckBox: CheckBox
    lateinit var bigSwitchButton: Switch
    lateinit var radioGroup: RadioGroup
    lateinit var radiobuttona:RadioButton
    lateinit var b:RadioButton
    lateinit var e:RadioButton
    lateinit var d:RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fouth)

        initViews()
        initListener()
    }

    private fun initListener() {
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

        radioGroup.setOnCheckedChangeListener { _ , checkedId ->
            Log.d("miko"," the item that was clicked id is $checkedId ")
            Log.d("miko", " so the first id is ${radiobuttona.id}")
            Log.d("miko", " so the second id is ${b.id}")
            Log.d("miko", " so the third id is ${e.id}")
            Log.d("miko", " so the fouth id is ${d.id}")

            when(checkedId){
                radiobuttona.id -> {
                    Log.d("tero","Fisrt buuttoin was clicked homie")
                }
                b.id -> {
                    Log.d("tero","second button was clicked and we need to do some magic here")
                }
                e.id -> {
                    Log.d("tero","third button was clicked and we need to do some magic here")
                }
                d.id -> {
                    Log.d("tero","fouth button was clicked and we need to do some magic here")
                }
                else ->{}
            }

        }

    }

    fun initViews(){
        bigCheckBox = findViewById(R.id.checkbox_theater)
        bigSwitchButton = findViewById(R.id.switch_theater)
        radioGroup = findViewById(R.id.radio_group)
        radiobuttona = findViewById(R.id.radio_theater)
        b = findViewById(R.id.radio2_theater)
        e = findViewById(R.id.radio3_theater)
        d = findViewById(R.id.radio4_theater)
    }
}