package com.example.hellokottin0427

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Exception

class BmiKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_view_binding)

        val heightField = findViewById<EditText>(R.id.HeightField)
        val weightField = findViewById<EditText>(R.id.WeightField)
        val btnbmi = findViewById<Button>(R.id.btnBmi)
        val txtReuslt = findViewById<TextView>(R.id.textRst)

        btnbmi.setOnClickListener{
            try{
            val sHeight = heightField.getText().toString().toDouble()
            val sWeight = weightField.getText().toString().toDouble()


            val bmi = sWeight/Math.pow(sHeight/100.0 ,2.0)
            txtReuslt.setText("your BMI : " + bmi)
            }
            catch (e : Exception)
            {
                txtReuslt.setText("inputs missing");
            }
            }

    }
}