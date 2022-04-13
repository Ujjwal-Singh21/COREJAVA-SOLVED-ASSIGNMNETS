package com.Exp37.SortScores;
import java.util.Arrays;

public class SortScore extends Thread {

    String matchType;
    String scoreString;
    Integer[] scores = new Integer[5];

    public SortScore(String matchType, String scoreString) {
        this.matchType = matchType;
        this.scoreString = scoreString;
    }

    @Override
    public void run() {

        String[] splitScores = scoreString.split(",");

        for (int i = 1; i <= scores.length; i++) {
            scores[i - 1] = Integer.parseInt(splitScores[i - 1]);
        }

        Arrays.sort(scores);

    }

    public Integer[] getScores() {

        return scores;

    }
}
