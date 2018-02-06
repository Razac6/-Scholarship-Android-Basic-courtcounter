package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 100;
    int scoreTeamB = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForButtonThree(View v) {
        if(scoreTeamA > 0){
        displayForTeamA(scoreTeamA = scoreTeamA - 3);
    }}

    public void displayForButtonTwo(View v) {
        if(scoreTeamA > 0){
        displayForTeamA(scoreTeamA = scoreTeamA - 2);
    }}

    public void displayForButtonOne(View v) {
        if(scoreTeamA > 0){
        displayForTeamA(scoreTeamA = scoreTeamA - 1);
    }}


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForButtonBThree(View v) {
        if(scoreTeamB > 0){
        displayForTeamB(scoreTeamB = scoreTeamB - 3);
    }}

    public void displayForButtonBTwo(View v) {
        if(scoreTeamB > 0){
        displayForTeamB(scoreTeamB = scoreTeamB - 2);
    }}

    public void displayForButtonBOne(View v) {
        if(scoreTeamB > 0){
        displayForTeamB(scoreTeamB = scoreTeamB - 1);
    }}


    /**
     * Reset button
     */
    public void resetScoreButton(View v) {
        displayForTeamA(scoreTeamA = 100);
        displayForTeamB(scoreTeamB = 100);

    }


}
