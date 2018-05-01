package edu.illinois.cs.cs125.finalproject;

import android.content.Intent;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameOverScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over_screen);

        final TextView endPoints = findViewById(R.id.EndPoints2);

        endPoints.setText("Points : " + Points.getPoints());

        final Button reset = findViewById(R.id.TryAgain2);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Points.setLifes(3);
                Points.setPoints(0);
                Activity1.mTimeLeftInMillis = 15000;
                Intent myInetent = new Intent();
                myInetent.setClass(GameOverScreen.this, MainScreen.class);
                startActivity(myInetent);
            }
        });

    }
}
