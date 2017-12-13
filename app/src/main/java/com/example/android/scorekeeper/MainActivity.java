package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

         /* Show the scores and the fouls when the device is rotated. */
        if (savedInstanceState != null) {
            scoreTeamA = savedInstanceState.getInt("scoreTeamA");
            foulTeamA = savedInstanceState.getInt("foulTeamA");
            scoreTeamB = savedInstanceState.getInt("scoreTeamB");
            foulTeamB = savedInstanceState.getInt("foulTeamB");
            displayForTeamA(scoreTeamA);
            displayForFoulTeamA(foulTeamA);
            displayForTeamB(scoreTeamB);
            displayForFoulTeamB(foulTeamB);
        }

    }

    /**
     * Saves the scores and fouls when the device is rotated.
     */
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("scoreTeamA", scoreTeamA);
        savedInstanceState.putInt("foulTeamA", foulTeamA);
        savedInstanceState.putInt("scoreTeamB", scoreTeamB);
        savedInstanceState.putInt("foulTeamB", foulTeamB);



    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);

    }

    /**
     * Displays the given foul for Team A.
     */
    public void displayForFoulTeamA(int foulTeamA) {
        TextView foulView = findViewById(R.id.team_a_foul);
        foulView.setText(String.valueOf(foulTeamA));
    }

    /**
     * Increase the foul for Team B by 1 point.
     */
    public void addOneForFoulTeamA(View v) {
        foulTeamA = foulTeamA + 1;
        displayForFoulTeamA(foulTeamA);
    }

    /**
     * Displays the given foul for Team B.
     */
    public void displayForFoulTeamB(int foulTeamB) {
        TextView foulView = findViewById(R.id.team_b_foul);
        foulView.setText(String.valueOf(foulTeamB));
    }


    /**
     * Increase the foul for Team B by 1 point.
     */
    public void addOneForFoulTeamB(View v) {
        foulTeamB = foulTeamB + 1;
        displayForFoulTeamB(foulTeamB);
    }

    /**
     *
     * Reset the scores for both teams back to 0
     */

    public void resetScore(View v) {
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
        foulTeamA = 0;
        displayForFoulTeamA(foulTeamA);
        foulTeamB = 0;
        displayForFoulTeamB(foulTeamB);
    }


}
