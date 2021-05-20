package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.format.Time;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Calendar;


public class MainActivity2 extends AppCompatActivity {
    Button button;
    Timer currentTime;
    //String str2 = currentTime.toString();

    String str1;
    String s1,s2,s3;
    EditText hour;
    EditText minute;
    EditText second;
    TextView time;
    TextView text1;
    TextView text;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button set;

    String str2 ;
    String str3;
    String str4;
    String str5;
    String str6;
    //String str22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        button = (Button)findViewById(R.id.buttonBack);
        //text = (TextView)findViewById(R.id.texttemp);
        text1 = (TextView)findViewById(R.id.app);
        hour = (EditText)findViewById(R.id.hourText);
        minute = (EditText)findViewById(R.id.minuteText);
        second = (EditText)findViewById(R.id.secondText);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        set = (Button)findViewById(R.id.setTime);
        time = (TextView)findViewById(R.id.timeFinal);

        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = hour.getText().toString();
                s2 = minute.getText().toString();
                s3 = second.getText().toString();
                str1 = s1+":"+s2+":"+s3;
                time.setText(str1);
                button1.setBackgroundColor(Color.BLUE);
                button2.setBackgroundColor(Color.BLUE);
                button3.setBackgroundColor(Color.BLUE);
                button4.setBackgroundColor(Color.BLUE);
                button5.setBackgroundColor(Color.BLUE);
            }
        });

        Timer t = new Timer();


        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Date dt = new Date();
                int hours = dt.getHours();
                int minutes= dt.getMinutes();
                int seconds = dt.getSeconds();
                String strDate = hours +":"+minutes +":"+seconds;
                //text.setText(strDate);
                int nextSecond;
                //int nextMin1;
                if (strDate.equals(str1)) {
                        nextSecond = seconds +10;
                        str2 = hours + ":" + minutes + ":" + nextSecond;
                        text1.setText(str2);
                        button1.setBackgroundColor(Color.GREEN);
                    }
                else if(strDate.equals(str2)) {
                    //text1.setText("Currently OFF");
                    nextSecond = seconds +10;
                    str3 = hours + ":" + minutes + ":" + nextSecond;
                    text1.setText(str3);
                    button1.setBackgroundColor(Color.RED);
                    button2.setBackgroundColor(Color.GREEN);
                    //button2.setBackgroundColor(Color.GREEN);
                }
                else if(strDate.equals(str3)) {
                    //text1.setText("Currently OFF");
                    nextSecond = seconds +10;
                    str4 = hours + ":" + minutes + ":" + nextSecond;
                    text1.setText(str4);
                    button2.setBackgroundColor(Color.RED);
                    button3.setBackgroundColor(Color.GREEN);
                    //button2.setBackgroundColor(Color.GREEN);
                }
                else if(strDate.equals(str4)) {
                    //text1.setText("Currently OFF");
                    nextSecond = seconds +10;
                    str5 = hours + ":" + minutes + ":" + nextSecond;
                    text1.setText(str5);
                    button3.setBackgroundColor(Color.RED);
                    button4.setBackgroundColor(Color.GREEN);
                    //button2.setBackgroundColor(Color.GREEN);
                }
                else if(strDate.equals(str5)) {
                    //text1.setText("Currently OFF");
                    nextSecond = seconds +10;
                    str6 = hours + ":" + minutes + ":" + nextSecond;
                    text1.setText(str6);
                    button4.setBackgroundColor(Color.RED);
                    button5.setBackgroundColor(Color.GREEN);
                    //button2.setBackgroundColor(Color.GREEN);
                }
                else if(strDate.equals(str6)) {
                    //text1.setText("Currently OFF");
                    button5.setBackgroundColor(Color.RED);
                    //button2.setBackgroundColor(Color.GREEN);
                }
                else{

                }
                }
        }, 0, 1000);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back();
            }
        });

    }
    public void back(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}