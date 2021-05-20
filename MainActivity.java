package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends AppCompatActivity {
    Button appA;
    Button appB;
    Button appC;
    Button appD;
    String str1 = "14:5";
    String str2 = "12:37";
    String str3 = "12:20";
    String str4 = "12:21";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        appA = (Button)findViewById(R.id.app_a);
        Timer t = new Timer();
        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Date dt = new Date();
                int hours = dt.getHours();
                int minutes= dt.getMinutes();
                String strDate = hours +":"+minutes;
                //appA.setText(strDate);

                if (strDate.equals(str1)) {
                    appA.setText("APP A ON");
                    appA.setBackgroundColor(Color.GREEN);
                    appA.setTextColor(Color.BLACK);
                } else {
                    appA.setText("APP A OFF");
                    appA.setBackgroundColor(Color.RED);
                }
                if (strDate.equals(str2)) {
                    appB.setText("APP B ON");
                    appB.setBackgroundColor(Color.GREEN);
                    appB.setTextColor(Color.BLACK);

                } else {
                    appB.setText("APP B OFF");
                    appB.setBackgroundColor(Color.RED);
                }
                if (strDate.equals(str3)) {
                    appC.setText("APP C ON");
                    appC.setBackgroundColor(Color.GREEN);
                    appC.setTextColor(Color.BLACK);

                } else {
                    appC.setText("APP C OFF");
                    appC.setBackgroundColor(Color.RED);
                }
                if (strDate.equals(str4)) {
                    appD.setText("APP D ON");
                    appD.setBackgroundColor(Color.GREEN);
                    appD.setTextColor(Color.BLACK);

                } else {
                    appD.setText("APP D OFF");
                    appD.setBackgroundColor(Color.RED);
                }
            }
        }, 0, 1000);

        appB = (Button)findViewById(R.id.app_b);
        appC = (Button)findViewById(R.id.app_c);
        appD = (Button)findViewById(R.id.app_d);

        appA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appA();
            }
        });
        appB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appB();
            }
        });
        appC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appC();
            }
        });
        appD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appD();
            }
        });

    }

    public void appA(){
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
    public void appB(){
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
    public void appC(){
        Intent intent = new Intent(this,MainActivity4.class);
        startActivity(intent);
    }
    public void appD(){
        Intent intent = new Intent(this,MainActivity5.class);
        startActivity(intent);
    }

}