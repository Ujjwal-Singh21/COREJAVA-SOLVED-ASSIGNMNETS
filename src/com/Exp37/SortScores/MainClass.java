package com.Exp37.SortScores;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        SortScore sortScore1 = null, sortScore2 = null, sortScore3 = null;

        for (int i = 1; i <= 3; i++) {

            System.out.println("Enter the MatchType: ");
            String matchType = scanner.next();

            System.out.println("Enter the scores: ");
            String scoresString = scanner.next();

            if (i == 1) {
                sortScore1 = new SortScore(matchType, scoresString);
                sortScore1.start();
            } else if (i == 2) {
                sortScore2 = new SortScore(matchType, scoresString);
                sortScore2.start();
            } else {
                sortScore3 = new SortScore(matchType, scoresString);
                sortScore3.start();
                sortScore3.join();
            }
        }

        //printing
        System.out.println("\n");
        System.out.println("Ordered Score List");

        System.out.println("Match: " + sortScore1.matchType);
        Integer[] scores1 = sortScore1.getScores();
        for (Integer s : scores1) {
            System.out.println(s);
        }

        System.out.println("Match: " + sortScore2.matchType);
        Integer[] scores2 = sortScore2.getScores();
        for (Integer s : scores2) {
            System.out.println(s);
        }

        System.out.println("Match: " + sortScore3.matchType);
        Integer[] scores3 = sortScore3.getScores();
        for (Integer s : scores3) {
            System.out.println(s);
        }
    }
}
