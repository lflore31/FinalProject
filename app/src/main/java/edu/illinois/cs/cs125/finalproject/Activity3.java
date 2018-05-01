package edu.illinois.cs.cs125.finalproject;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;

public class Activity3 extends AppCompatActivity {

    /** */
    private static final long START_TIME_IN_MILLIS = 30000;

    /** */
    private static long mTimeLeftInMillis = START_TIME_IN_MILLIS;

    /** */
    private CountDownTimer mcountDownTimer;

    /** */
    public TextView mTextViewCountDown;

    /** */
    public static boolean gameOver;

    /** */
    public TextView lives;

    /** */
    public TextView points;

    /** */
    private static final int TEN = 1000;

    /** */
    private static final int SIX = 60;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        mTextViewCountDown = findViewById(R.id.Timer3);
        lives = findViewById(R.id.Lifes);
        points = findViewById(R.id.Points);
        points.setText("Points: " + Points.getPoints());
        lives.setText("Lives: " + Points.getLives());
        startTimer();
        Button right = findViewById(R.id.Cakefish_Cake);
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                Points.right();
                changeActivity();
            }
        });
        Button wrong = findViewById(R.id.Cakefish_Fish);
        wrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                Points.wrong();
                if (Activity1.gameOver) {
                    Intent myIntent = new Intent();
                    myIntent.setClass(Activity3.this, GameOverScreen.class);
                    startActivity(myIntent);
                }
                changeActivity();
            }
        });
    }

    /** */
    private void startTimer() {
        mcountDownTimer = new CountDownTimer(Activity1.getmTimeLeftInMillis(), TEN) {
            @Override
            public void onTick(final long millisUntilFinished) {
                Activity1.mTimeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                Intent myIntent = new Intent();
                myIntent.setClass(Activity3.this, GameOverScreen.class);
                startActivity(myIntent);
                Activity1.gameOver = true;
            }
        }.start();
    }

    /** */
    public void updateCountDownText() {
        int minutes = (int) (Activity1.mTimeLeftInMillis / TEN) / SIX;
        int seconds = (int) (Activity1.mTimeLeftInMillis / TEN) % SIX;
        String timeLeftFormatted = String.format(Locale.getDefault(),
                "%02d:%02d", minutes, seconds);
        mTextViewCountDown.setText(timeLeftFormatted);
    }

    private void changeActivity() {
        if (!Activity1.gameOver) {
            Random rnd = new Random();
            int x = rnd.nextInt(14) + 1;
            Intent myInetent = new Intent();
            switch (x) {
                case 1:
                    myInetent.setClass(Activity3.this, Activity1.class);
                    break;
                case 2:
                    myInetent.setClass(Activity3.this, Activity2.class);
                    break;
                case 3:
                    myInetent.setClass(Activity3.this, Activity4.class);
                    break;
                case 4:
                    myInetent.setClass(Activity3.this, Activity5.class);
                    break;
                case 5:
                    myInetent.setClass(Activity3.this, Activity6.class);
                    break;
                case 6:
                    myInetent.setClass(Activity3.this, Activity7.class);
                    break;
                case 7:
                    myInetent.setClass(Activity3.this, Activity8.class);
                    break;
                case 8:
                    myInetent.setClass(Activity3.this, Activity9.class);
                    break;
                case 9:
                    myInetent.setClass(Activity3.this, Activity10.class);
                    break;
                case 10:
                    myInetent.setClass(Activity3.this, Activity11.class);
                    break;
                case 11:
                    myInetent.setClass(Activity3.this, Activity12.class);
                    break;
                case 12:
                    myInetent.setClass(Activity3.this, Activity13.class);
                    break;
                case 13:
                    myInetent.setClass(Activity3.this, Activity14.class);
                    break;
                case 14:
                    myInetent.setClass(Activity3.this, Activity15.class);
                    break;
            }
            startActivity(myInetent);
        }
    }
}