package com.Exp36.MatchSummary;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of lines in the summary");
        int numOfLines = Integer.parseInt(scanner.next());
        scanner.nextLine();

        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();
        String line4 = scanner.nextLine();

        TitleCaseThread titleCaseThread1 = null, titleCaseThread2 = null, titleCaseThread3 = null,
                titleCaseThread4 = null;

        for (int i = 1; i <= numOfLines; i++) {

            if (i == 1) {
                titleCaseThread1 = new TitleCaseThread(line1);
                Thread thread1 = new Thread(titleCaseThread1);
                thread1.start();
                thread1.join();

            } else if (i == 2) {
                titleCaseThread2 = new TitleCaseThread(line2);
                Thread thread2 = new Thread(titleCaseThread2);
                thread2.start();
                thread2.join();

            } else if (i == 3) {
                titleCaseThread3 = new TitleCaseThread(line3);
                Thread thread3 = new Thread(titleCaseThread3);
                thread3.start();
                thread3.join();

            } else if (i == 4) {
                titleCaseThread4 = new TitleCaseThread(line4);
                Thread thread4 = new Thread(titleCaseThread4);
                thread4.start();
                thread4.join();

            }
        }

        System.out.println("\n");
        String sentence1 = titleCaseThread1.getModifiedSummary();
        System.out.println("Sentence 1 : " + sentence1);

        String sentence2 = titleCaseThread2.getModifiedSummary();
        System.out.println("Sentence 2 : " + sentence2);

        String sentence3 = titleCaseThread3.getModifiedSummary();
        System.out.println("Sentence 3 : " + sentence3);

        String sentence4 = titleCaseThread4.getModifiedSummary();
        System.out.println("Sentence 4 : " + sentence4);

    }
}



