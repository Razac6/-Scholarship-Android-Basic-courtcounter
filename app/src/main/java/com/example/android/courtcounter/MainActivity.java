package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int cardTeamA = 0;

    int scoreTeamB = 0;
    int cardTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */


//    public void displayForButtonThree(View v) {
//        if (scoreTeamA > 0) {
//            displayForTeamA(scoreTeamA = scoreTeamA - 3);
//        }
//    }
//
//    public void displayForButtonTwo(View v) {
//        if (scoreTeamA > 0) {
//            displayForTeamA(scoreTeamA = scoreTeamA - 2);
//        }
//    }

    /*
     * TeamA
     * */

//    score
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForButtonOne(View v) {
        displayForTeamA(scoreTeamA = scoreTeamA + 1);
    }

    //      cards
    public void displayForACard(int card) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_cards);
        scoreView.setText(String.valueOf(card));
    }

    public void displayForButtonAcard(View view) {
        displayForACard(cardTeamA = cardTeamA + 1);
    }

    /**
     * TeamB
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForButtonBSecond(View v) {
        displayForTeamB(scoreTeamB = scoreTeamB + 1);
    }

    //      cards
    public void displayForBCard(int card) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_cards);
        scoreView.setText(String.valueOf(card));
    }

    public void displayForButtonBcard(View view) {
        displayForBCard(cardTeamB = cardTeamB + 1);
    }

//    public void displayForButtonBThree(View v) {
//        if (scoreTeamB > 0) {
//            displayForTeamB(scoreTeamB = scoreTeamB - 3);
//        }
//    }
//
//    public void displayForButtonBTwo(View v) {
//        if (scoreTeamB > 0) {
//            displayForTeamB(scoreTeamB = scoreTeamB - 2);
//        }
//    }

    /**
     * Reset button
     */
    public void resetScoreButton(View v) {
        displayForTeamA(scoreTeamA = 0);
        displayForTeamB(scoreTeamB = 0);
    }


}
