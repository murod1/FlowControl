package com.example.hellokottin0427

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.layout_flowcontrol.*

class FlowControlKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_flowcontrol);

        btn_LD.setOnClickListener{
            val number = fieldNumber.text.toString().toInt()

            if(number % 2 ==0){
                Toast.makeText(applicationContext,"${number}은(는) 2의 배수입니다.",Toast.LENGTH_SHORT).show()
            }
           else if(number % 3 ==0){
                Toast.makeText(applicationContext,"${number}은(는) 3의 배수입니다.",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(applicationContext,"${number}은(는) else입니다.",Toast.LENGTH_LONG).show()
            }
            when(number){
                4,9 -> btn_LD.text ="실행 for " + number
                else -> btn_LD.text="실행 for else"
            }
        }
    }
}