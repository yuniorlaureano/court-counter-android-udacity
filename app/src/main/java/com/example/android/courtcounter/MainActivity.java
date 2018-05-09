package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPlusThreeA(View view){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void displayPlusTwoA(View view){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void displayFreeA(View view){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void displayPlusThreeB(View view){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void displayPlusTwoB(View view){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void displayFreeB(View view){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }


    public  void reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
