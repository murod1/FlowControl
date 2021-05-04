package com.example.hellokottin0427;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BmiJavaActivity extends AppCompatActivity {
    EditText HightField, WeightField;
    TextView TextResult;
    Button BtnBmi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_view_binding);
        HightField = findViewById(R.id.HeightField);
        WeightField = findViewById(R.id.WeightField);
        TextResult = findViewById(R.id.textRst);
        BtnBmi = findViewById(R.id.btnBmi);

        BtnBmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /*   String sHeight = HightField.getText().toString();
                String sWeight = WeightField.getText().toString();

              if(!HightField.toString().isEmpty()){

                if(sHeight != null && sWeight !=null){
                double bmi = Double.parseDouble(sWeight) / Math.pow(Double.parseDouble(sHeight)/100.,2.);
                TextResult.setText("Your BMI : " +bmi);
                }
            }
                else {
                    TextResult.setText("inputs missing");
                }
            }*/
            try {
                String sHeight = HightField.getText().toString();
                String sWeight = WeightField.getText().toString();
                double bmi = Double.parseDouble(sWeight) / Math.pow(Double.parseDouble(sHeight)/100.,2.);
                TextResult.setText("Your BMI : " +bmi);
            }catch (Exception e){
                TextResult.setText("inputs missing");
            }
            }
        });
        }
    }
