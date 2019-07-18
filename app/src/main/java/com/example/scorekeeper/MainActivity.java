package com.example.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int points1=0;
    int points2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void score_pirates_1(View View){
        points1+=1;
        display_score_teamA(points1);
    }
    public void score_pirates_2(View View){
        points1+=2;
        display_score_teamA(points1);
    }
    public void score_pirates_3(View View){
        points1+=3;
        display_score_teamA(points1);
    }
    public void score_pirates_4(View View){
        points1+=4;
        display_score_teamA(points1);
    }
    public void score_pirates_5(View View){
        points1+=5;
        display_score_teamA(points1);
    }
    public void score_pirates_6(View View){
        points1+=6;
        display_score_teamA(points1);
    }
    public void score_pirates_7(View View){
        points1+=7;
        display_score_teamA(points1);
    }
    public void score_pirates_8(View View){
        points1+=8;
        display_score_teamA(points1);
    }
    public void score_pirates_9(View View){
        points1+=9;
        display_score_teamA(points1);
    }
    public void score_pirates_10(View View){
        points1+=10;
        display_score_teamA(points1);
    }
    public void score_pirates_11(View View){
        points1+=11;
        display_score_teamA(points1);
    }

    public void score_bulls_1(View View){
        points2+=1;
        display_score_teamB(points2);
    }
    public void score_bulls_2(View View){
        points2+=2;
        display_score_teamB(points2);
    }
    public void score_bulls_3(View View){
        points2+=3;
        display_score_teamB(points2);
    }
    public void score_bulls_4(View View){
        points2+=4;
        display_score_teamB(points2);
    }
    public void score_bulls_5(View View){
        points2+=5;
        display_score_teamB(points2);
    }
    public void score_bulls_6(View View){
        points2+=6;
        display_score_teamB(points2);
    }
    public void score_bulls_7(View View){
        points2+=7;
        display_score_teamB(points2);
    }
    public void score_bulls_8(View View){
        points2+=8;
        display_score_teamB(points2);
    }
    public void score_bulls_9(View View){
        points2+=9;
        display_score_teamB(points2);
    }
    public void score_bulls_10(View View){
        points2+=10;
        display_score_teamB(points2);
    }
    public void score_bulls_11(View View){
        points2+=11;
        display_score_teamB(points2);
    }

    public void reset(View View){
        points1=0;
        points2=0;
        display_score_teamA(points1);
        display_score_teamB(points2);
    }

   /* public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }*/

    public void display_score_teamA(int points){
        TextView t=(TextView)findViewById(R.id.score_pirates);
        t.setText(String.valueOf(points));
    }
    public void display_score_teamB(int points){
        TextView t=(TextView)findViewById(R.id.score_bulls);
        t.setText(String.valueOf(points));
    }

}
