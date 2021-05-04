package com.example.hellokottin0427;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class VariableJavaActivity extends AppCompatActivity {
    TextView txtActvityStartTime, txtCountBtnClicks,txtElapsedTime;
    Button btnClickMe;

    int Clickcount =0;
   final long starttime = System.currentTimeMillis();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_variable);

        txtActvityStartTime = findViewById(R.id.txtActvityStartTime);
        txtCountBtnClicks = findViewById(R.id.txtCountBtnClicks);
        txtElapsedTime = findViewById(R.id.txtElapsedTime);
        btnClickMe = findViewById(R.id.btnClickMe);
        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Clickcount+=1;
                txtCountBtnClicks.setText("Button clicks :"+ Clickcount);
                long elpsedSeconds = ((System.currentTimeMillis() -starttime)/1000);
                txtElapsedTime.setText( elpsedSeconds + "seconds elpsedSeconds");
            }
        });
        String timeTxt =new SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(starttime);
        txtActvityStartTime.setText("Activity Start time =" + timeTxt);
    }
}