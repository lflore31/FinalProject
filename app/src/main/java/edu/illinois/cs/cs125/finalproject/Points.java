package edu.illinois.cs.cs125.finalproject;

import android.content.Intent;

import java.util.Random;

public class Points {
    /** */
    private static final int STARTING_LIVES = 3;

    /** */
    public static int points = 0;

    /** */
    private static int lives = STARTING_LIVES;

    /** */
    public static void right() {
        updatePoints();
    }

    /** */
    public static void wrong() {
        updateLives();
    }

    /** */
    public static void updateLives() {
        lives--;
        if (lives == 0) {
            Activity1.gameOver = true;
            lives = STARTING_LIVES;
        }
    }

    /** */
    public static void updatePoints() {
        points += 10;
    }

    /** */
    public static int getLives() {
        return lives;
    }

    /** */
    public static int getPoints() {
        return points;
    }

    /** */
    public static void setPoints(int points) {
        Points.points = points;
    }

    /** */
    public static void setLifes(int lives) {
        Points.lives = lives;
    }


}
