package com.example.mobile_task_1_2_clicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mainText;
    Button mainBtn;
    Button mainBtn2;
    Button mainBtn3;

    private long score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = (TextView) findViewById(R.id.mainText);
        mainBtn = (Button) findViewById(R.id.button);
        mainBtn2 = (Button) findViewById(R.id.button2);
        mainBtn3 = (Button) findViewById(R.id.button3);

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score ++;
                String s;
                if (score % 10 >1 && score % 10 < 5 && (score % 100 < 10 || score % 100 > 20)) {
                    s = "Кнопка нажата " + score + " раза";
                }
                else s = "Кнопка нажата " + score + " раз";
                mainText.setText(s.toCharArray(),0, s.length());
            }
        };

        View.OnClickListener clickListener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score --;
                String s;
                if (Math.abs(score) % 10 >1 && Math.abs(score) % 10 < 5 && (Math.abs(score) % 100 < 10 || Math.abs(score) % 100 > 20)) {
                    s = "Кнопка нажата " + score + " раза";
                }
                else s = "Кнопка нажата " + score + " раз";
                mainText.setText(s.toCharArray(),0, s.length());
            }
        };

        View.OnClickListener clickListener3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 0;
                String s = "Кликов: " + score;
                mainText.setText(s.toCharArray(),0, s.length());
            }
        };

        mainBtn.setOnClickListener(clickListener);
        mainBtn2.setOnClickListener(clickListener2);
        mainBtn3.setOnClickListener(clickListener3);

    }
}

