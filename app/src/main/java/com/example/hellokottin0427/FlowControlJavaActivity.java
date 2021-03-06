package com.example.hellokottin0427;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.BreakIterator;

public class FlowControlJavaActivity extends AppCompatActivity {
    EditText fieldNumber;
    Button btnLD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_flowcontrol);

        fieldNumber = findViewById(R.id.fieldNumber);
        btnLD = findViewById(R.id.btn_LD);

        btnLD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = Integer.parseInt(fieldNumber.getText().toString());

                if(number% 2 ==0){
                    Toast.makeText(getApplicationContext(),""+number +"은(는) 2의 배수",Toast.LENGTH_SHORT).show();
                }
                if(number% 3 ==0){
                    Toast.makeText(getApplicationContext(),""+number +"은(는) 3의 배수",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),""+number +"은(는) Else",Toast.LENGTH_LONG).show();
                }
                switch(number){
                    case 4:
                    case 9:
                            btnLD.setText("실행 "+number);
                        break;
                     default:
                         btnLD.setText("실행");
                        break;
                }
            }

        });
    }
}