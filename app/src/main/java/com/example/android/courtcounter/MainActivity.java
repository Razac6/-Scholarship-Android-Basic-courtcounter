package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int cardTeamA = 0;
    int foulsTeamA = 0;

    int scoreTeamB = 0;
    int cardTeamB = 0;
    int foulsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

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

    //    fouls
    public void displayForAFouls(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(foul));
    }

    public void displayForButtonAfoul(View view) {
        displayForAFouls(foulsTeamA = foulsTeamA + 1);
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

    //    fouls
    public void displayForBFouls(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(foul));
    }

    public void displayForButtonBfoul(View view) {
        displayForBFouls(foulsTeamB = foulsTeamB + 1);
    }

    /**
     * Reset button
     */
    public void resetScoreButton(View v) {
        displayForTeamA(scoreTeamA = 0);
        displayForTeamB(scoreTeamB = 0);
        displayForACard(cardTeamA = 0);
        displayForBCard(cardTeamB = 0);
        displayForAFouls(foulsTeamA = 0);
        displayForBFouls(foulsTeamB = 0);
    }


}
