package com.example.android.courtcounter;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Set;

public class MainActivity extends AppCompatActivity {
    /**
     * Resource variable for strings
     */
    android.content.res.Resources res;
    /**
     * Default team names
     */
    String teamA;
    String teamB;
    /**
     * Score variables
     */
    int goalsTeamA = 0;
    int goalsTeamB = 0;
    /**
     * Shot variables
     */
    int shotsTeamA = 0;
    int shotsTeamB = 0;
    /**
     * Shots on goal variables
     */
    int shotsOnGoalTeamA = 0;
    int shotsOnGoalTeamB = 0;
    /**
     * Foul variables
     */
    int foulsTeamA = 0;
    int foulsTeamB = 0;
    /**
     * Yellow cards variables
     */
    int yellowCardsTeamA = 0;
    int yellowCardsTeamB = 0;
    /**
     * Red cards variables
     */
    int redCardsTeamA = 0;
    int redCardsTeamB = 0;
    /**
     * TextView variables
     */
    TextView scoreViewTeamA;
    TextView scoreViewTeamB;
    TextView shotsViewTeamA;
    TextView shotsViewTeamB;
    TextView shotsOnGoalViewTeamA;
    TextView shotsOnGoalViewTeamB;
    TextView foulsViewTeamA;
    TextView foulsViewTeamB;
    TextView yellowCardsViewTeamA;
    TextView yellowCardsViewTeamB;
    TextView redCardsViewTeamA;
    TextView redCardsViewTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the resource variable
        res = getResources();

        // Set default team names
        teamA = res.getString(R.string.team_a);
        teamB = res.getString(R.string.team_b);

        // Set the TexView variables
        scoreViewTeamA = (TextView) findViewById(R.id.team_a_score);
        scoreViewTeamB = (TextView) findViewById(R.id.team_b_score);
        shotsViewTeamA = (TextView) findViewById(R.id.team_a_shot);
        shotsViewTeamB = (TextView) findViewById(R.id.team_b_shot);
        shotsOnGoalViewTeamA = (TextView) findViewById(R.id.team_a_shot_on_goal);
        shotsOnGoalViewTeamB = (TextView) findViewById(R.id.team_b_shot_on_goal);
        foulsViewTeamA = (TextView) findViewById(R.id.team_a_foul);
        foulsViewTeamB = (TextView) findViewById(R.id.team_b_foul);
        yellowCardsViewTeamA = (TextView) findViewById(R.id.team_a_yellow_card);
        yellowCardsViewTeamB = (TextView) findViewById(R.id.team_b_yellow_card);
        redCardsViewTeamA = (TextView) findViewById(R.id.team_a_red_card);
        redCardsViewTeamB = (TextView) findViewById(R.id.team_b_red_card);
    }
    /**
     * Add points for Team A.
     */
    public void scoreTeamA (View view) {
        goalsTeamA = goalsTeamA + 1;
        shotsOnGoalTeamA = shotsOnGoalTeamA + 1;
        String currentTime = getTime(view);
        liveText(res.getString(R.string.scored, currentTime, teamA));
        displayScoreTeamA(goalsTeamA);
        displayShotsOnGoalTeamA(shotsOnGoalTeamA);
    }
    public void shotTeamA (View view) {
        shotsTeamA = shotsTeamA + 1;
        String currentTime = getTime(view);
        liveText(res.getString(R.string.shoots, currentTime, teamA));
        displayShotsTeamA(shotsTeamA);
    }
    public void shotOnGoalTeamA (View view) {
        shotsOnGoalTeamA = shotsOnGoalTeamA + 1;
        String currentTime = getTime(view);
        liveText(res.getString(R.string.shoots_on_goal, currentTime, teamA));
        displayShotsOnGoalTeamA(shotsOnGoalTeamA);
    }
    public void foulTeamA (View view) {
        foulsTeamA = foulsTeamA + 1;
        String currentTime = getTime(view);
        liveText(res.getString(R.string.foul_commited, currentTime, teamA));
        displayFoulsTeamA(foulsTeamA);
    }
    public void yellowCardTeamA (View view) {
        yellowCardsTeamA = yellowCardsTeamA + 1;
        String currentTime = getTime(view);
        liveText(res.getString(R.string.yellow_card_shown, currentTime, teamA));
        displayYellowCardsTeamA(yellowCardsTeamA);
    }
    public void redCardTeamA (View view) {
        redCardsTeamA = redCardsTeamA + 1;
        String currentTime = getTime(view);
        liveText(res.getString(R.string.red_card_shown, currentTime, teamA));
        displayRedCardsTeamA(redCardsTeamA);
    }
    /**
     * Add points for Team B.
     */
    public void scoreTeamB (View view) {
        goalsTeamB = goalsTeamB + 1;
        shotsOnGoalTeamB = shotsOnGoalTeamB + 1;
        String currentTime = getTime(view);
        liveText(res.getString(R.string.scored, currentTime, teamB));
        displayScoreTeamB(goalsTeamB);
        displayShotsOnGoalTeamB(shotsOnGoalTeamB);
    }
    public void shotTeamB (View view) {
        shotsTeamB = shotsTeamB + 1;
        String currentTime = getTime(view);
        liveText(res.getString(R.string.shoots, currentTime, teamB));
        displayShotsTeamB(shotsTeamB);
    }
    public void shotOnGoalTeamB (View view) {
        shotsOnGoalTeamB = shotsOnGoalTeamB + 1;
        String currentTime = getTime(view);
        liveText(res.getString(R.string.shoots_on_goal, currentTime, teamB));
        displayShotsOnGoalTeamB(shotsOnGoalTeamB);
    }
    public void foulTeamB (View view) {
        foulsTeamB = foulsTeamB + 1;
        String currentTime = getTime(view);
        liveText(res.getString(R.string.foul_commited, currentTime, teamB));
        displayFoulsTeamB(foulsTeamB);
    }
    public void yellowCardTeamB (View view) {
        yellowCardsTeamB = yellowCardsTeamB + 1;
        String currentTime = getTime(view);
        liveText(res.getString(R.string.yellow_card_shown, currentTime, teamB));
        displayYellowCardsTeamB(yellowCardsTeamB);
    }
    public void redCardTeamB (View view) {
        redCardsTeamB = redCardsTeamB + 1;
        String currentTime = getTime(view);
        liveText(res.getString(R.string.red_card_shown, currentTime, teamA));
        displayRedCardsTeamB(redCardsTeamB);
    }
    /**
     * Start match.
     */
    public void startMatch(View view) {
        // Check if team A is set
        if (getTeamA(view).length()>0) {
            teamA = getTeamA(view);
        }
        // Check if team B is set
        if (getTeamB(view).length()>0) {
            teamB = getTeamB(view);
        }
        liveText(res.getString(R.string.match_begins, teamA, teamB));
        Chronometer time = findViewById(R.id.timer);
        time.setBase(SystemClock.elapsedRealtime());
        time.start();
    }
    /**
     * Reset scores.
     */
    public void resetScore(View view) {
        goalsTeamA = 0;
        displayScoreTeamA(goalsTeamA);
        goalsTeamB = 0;
        displayScoreTeamB(goalsTeamB);
        shotsTeamA = 0;
        displayShotsTeamA(shotsTeamA);
        shotsTeamB = 0;
        displayShotsTeamB(shotsTeamB);
        shotsOnGoalTeamA = 0;
        displayShotsOnGoalTeamA(shotsOnGoalTeamA);
        shotsOnGoalTeamB = 0;
        displayShotsOnGoalTeamB(shotsOnGoalTeamB);
        foulsTeamA = 0;
        displayFoulsTeamA(foulsTeamA);
        foulsTeamB = 0;
        displayFoulsTeamB(foulsTeamB);
        yellowCardsTeamA = 0;
        displayYellowCardsTeamA(yellowCardsTeamA);
        yellowCardsTeamB = 0;
        displayYellowCardsTeamB(yellowCardsTeamB);
        redCardsTeamA = 0;
        displayRedCardsTeamA(redCardsTeamA);
        redCardsTeamB = 0;
        displayRedCardsTeamB(redCardsTeamB);
        /**
         * Stop the timer and set to 0;
         */
        Chronometer time = findViewById(R.id.timer);
        time.setBase(SystemClock.elapsedRealtime());
        time.stop();
        /**
         * Reset Livetext
         */
        TextView scoreView = (TextView) findViewById(R.id.live_text);
        scoreView.setText("");
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayScoreTeamA(int score) {
        scoreViewTeamA.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayScoreTeamB(int score) {
        scoreViewTeamB.setText(String.valueOf(score));
    }
    /**
     * Displays the given shots for Team A.
     */
    public void displayShotsTeamA(int score) {
        shotsViewTeamA.setText(String.valueOf(score));
    }
    /**
     * Displays the given shots for Team B.
     */
    public void displayShotsTeamB(int score) {
        shotsViewTeamB.setText(String.valueOf(score));
    }
    /**
     * Displays the given shots on goal for Team A.
     */
    public void displayShotsOnGoalTeamA(int score) {
        shotsOnGoalViewTeamA.setText(String.valueOf(score));
    }
    /**
     * Displays the given shots on goal for Team B.
     */
    public void displayShotsOnGoalTeamB(int score) {
        shotsOnGoalViewTeamB.setText(String.valueOf(score));
    }
    /**
     * Displays the given fouls for Team A.
     */
    public void displayFoulsTeamA(int score) {
        foulsViewTeamA.setText(String.valueOf(score));
    }
    /**
     * Displays the given fouls for Team B.
     */
    public void displayFoulsTeamB(int score) {
        foulsViewTeamB.setText(String.valueOf(score));
    }
    /**
     * Displays the given yellow cards for Team A.
     */
    public void displayYellowCardsTeamA(int score) {
        yellowCardsViewTeamA.setText(String.valueOf(score));
    }
    /**
     * Displays the given yellow cards for Team B.
     */
    public void displayYellowCardsTeamB(int score) {
        yellowCardsViewTeamB.setText(String.valueOf(score));
    }
    /**
     * Displays the given red cards for Team A.
     */
    public void displayRedCardsTeamA(int score) {
        redCardsViewTeamA.setText(String.valueOf(score));
    }
    /**
     * Displays the given red cards for Team B.
     */
    public void displayRedCardsTeamB(int score) {
        redCardsViewTeamA.setText(String.valueOf(score));
    }

    /**
     * Get the name of the first team
     */
    public String getTeamA (View view) {
        EditText teamA = (EditText) findViewById(R.id.team_a);
        return teamA.getText().toString();
    }
    /**
     * Get the name of the second team
     */
    public String getTeamB (View view) {
        EditText teamB = (EditText) findViewById(R.id.team_b);
        return teamB.getText().toString();
    }
    /**
     * Get the current time
     */
    public String getTime (View view) {
        Chronometer time = findViewById(R.id.timer);
        return (String) time.getText();
    }
    /**
     * Update Livetext
     */
    public void liveText (String text) {
        TextView scoreView = (TextView) findViewById(R.id.live_text);
        scoreView.setText( text + "\n" + scoreView.getText());
    }
}
