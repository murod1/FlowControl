package com.example.hellokottin0427

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnJAVA =findViewById<Button>(R.id.BtnJava)
        val btnKOTLIN =findViewById<Button>(R.id.BtnKotlin)
        val btnVariableJavaActivity = findViewById<Button>(R.id.btnvariablejava)
        val btnVariableKotlinActivity = findViewById<Button>(R.id.btnVariableKotlin)
        val btnFlowControlJava = findViewById<Button>(R.id.btnFlowControlJava)
        val btnFlowControlKotlin = findViewById<Button>(R.id.btnFlowControlKotlin)

        btnJAVA.setOnClickListener{
            startActivity(Intent(this@MainActivity, BmiJavaActivity::class.java))

        }

        btnKOTLIN.setOnClickListener{
            startActivity(Intent(this@MainActivity, BmiKotlinActivity::class.java))

        }
        btnVariableJavaActivity.setOnClickListener{
            startActivity(Intent(this@MainActivity, VariableJavaActivity::class.java))

        }
        btnVariableKotlinActivity.setOnClickListener{
            startActivity(Intent(this@MainActivity, VariableKotlinActivity::class.java))

        }
        btnFlowControlJava.setOnClickListener{
            startActivity(Intent(this@MainActivity, FlowControlJavaActivity::class.java))

        }
        btnFlowControlKotlin.setOnClickListener{
            startActivity(Intent(this@MainActivity, FlowControlKotlinActivity::class.java))

        }
    }

}

