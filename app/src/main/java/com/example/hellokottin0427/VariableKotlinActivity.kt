package com.example.hellokottin0427

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class VariableKotlinActivity : AppCompatActivity() {
    var clickcount =0
    val startTime = System.currentTimeMillis()
    var elpsedSeconds : Long = ((System.currentTimeMillis() -startTime)/1000).toLong()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_variable)

        val txtActivityStartTime = findViewById<TextView>(R.id.txtActvityStartTime)
        val txtCOuntBtnClicks = findViewById<TextView>(R.id.txtCountBtnClicks)
        val btnclickme = findViewById<Button>(R.id.btnClickMe)
        val txtElapsedTime = findViewById<TextView>(R.id.txtElapsedTime)

        btnclickme.setOnClickListener{
            clickcount++
            var elpsedSeconds : Long = ((System.currentTimeMillis() -startTime)/1000).toLong()
            txtCOuntBtnClicks.text = "Buttons = ${clickcount}"
            txtElapsedTime.text = "${elpsedSeconds} seconds elpsedSeconds"

        }
        val timeText = SimpleDateFormat("HH:mm:ss", Locale.KOREAN).format(startTime)
        txtActivityStartTime.text = "Activity start time = ${timeText}"

    }
}