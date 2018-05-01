package edu.illinois.cs.cs125.finalproject;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;

public class MainScreen extends AppCompatActivity {

    /**
     //     * Default logging tag for messages from the main activity.
     //     */
    private static final String TAG = "Lab12";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        final Button start = findViewById(R.id.StartButton);
        Activity1.gameOver = false;
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                changeActivity();
            }
        });
    }

    private void changeActivity() {
        Random rnd = new Random();
        int x = rnd.nextInt(15) + 1;
        Intent myInetent = new Intent();
        switch (x) {
            case 1:
                myInetent.setClass(MainScreen.this, Activity1.class);
                break;
            case 2:
                myInetent.setClass(MainScreen.this, Activity2.class);
                break;
            case 3:
                myInetent.setClass(MainScreen.this, Activity3.class);
                break;
            case 4:
                myInetent.setClass(MainScreen.this, Activity4.class);
                break;
            case 5:
                myInetent.setClass(MainScreen.this, Activity5.class);
                break;
            case 6:
                myInetent.setClass(MainScreen.this, Activity6.class);
                break;
            case 7:
                myInetent.setClass(MainScreen.this, Activity7.class);
                break;
            case 8:
                myInetent.setClass(MainScreen.this, Activity8.class);
                break;
            case 9:
                myInetent.setClass(MainScreen.this, Activity9.class);
                break;
            case 10:
                myInetent.setClass(MainScreen.this, Activity10.class);
                break;
            case 11:
                myInetent.setClass(MainScreen.this, Activity11.class);
                break;
            case 12:
                myInetent.setClass(MainScreen.this, Activity12.class);
                break;
            case 13:
                myInetent.setClass(MainScreen.this, Activity13.class);
                break;
            case 14:
                myInetent.setClass(MainScreen.this, Activity14.class);
                break;
            case 15:
                myInetent.setClass(MainScreen.this, Activity15.class);
                break;

        }
        startActivity(myInetent);
    }
}

