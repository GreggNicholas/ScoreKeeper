package com.example.greggnicholas.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mScore1;
    private int mScore2;

    private TextView mScoreText1;
    private TextView mScoreText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScoreText1 = (TextView) findViewById(R.id.score_1);
        mScoreText2 = (TextView) findViewById(R.id.score_2);

    }

    public void decreaseScore(View view) {
        int viewId = view.getId();
        switch (viewId) {
            case R.id.decreaseTeam1:
                //Team1
                mScore1--;
                mScoreText1.setText(String.valueOf(mScore1));
                break;
                //Team2
            case R.id.decreaseTeam2:

                mScore2--;
                mScoreText2.setText(String.valueOf(mScore2));

        }
    }


    public void increaseScore(View view) {
        int viewId = view.getId();
        switch (viewId) {
            case R.id.increaseTeam1:
                //team1
                mScore1++;
                mScoreText1.setText(String.valueOf(mScore1));
                break;
                //team2
            case R.id.increaseTeam2:
                mScore2++;
                mScoreText2.setText(String.valueOf(mScore2));
        }

    }
}
