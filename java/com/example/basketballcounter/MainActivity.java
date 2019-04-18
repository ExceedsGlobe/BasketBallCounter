package com.example.basketballcounter;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView scoreAtxt,scoreBtxt;
int scoreTeamA=0;
int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreAtxt=findViewById(R.id.teamAScore);
        scoreBtxt=findViewById(R.id.teamBScore);
        displayScoreA(scoreTeamA);
        displayScoreB(scoreTeamB);
    }

    public void displayScoreA(int score){
        scoreAtxt.setText(String.valueOf(score));
    }

    public void addThreePointsTeamA(View view) {
        scoreTeamA+=3;
        displayScoreA(scoreTeamA);
    }

    public void addTwoPointsTeamA(View view) {
        scoreTeamA+=2;
        displayScoreA(scoreTeamA);
    }
    public void addOnePointTeamA(View view) {
        scoreTeamA+=1;
        displayScoreA(scoreTeamA);
    }
    public void displayScoreB(int score){
        scoreBtxt.setText(String.valueOf(score));
    }

    public void addThreePointsTeamB(View view) {
        scoreTeamB+=3;
        displayScoreB(scoreTeamB);    }

    public void addTwoPointsTeamB(View view) {
        scoreTeamB+=2;
        displayScoreB(scoreTeamB);    }
    public void addOnePointTeamB(View view) {
        scoreTeamB+=1;
        displayScoreB(scoreTeamB);
    }

    public void onReset(View view) {
        scoreTeamA=0;
        scoreTeamB=0;
        displayScoreA(scoreTeamA);
        displayScoreB(scoreTeamB);

    }
}
