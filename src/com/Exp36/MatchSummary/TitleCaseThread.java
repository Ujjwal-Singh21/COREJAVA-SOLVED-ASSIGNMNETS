package com.Exp36.MatchSummary;

public class TitleCaseThread implements Runnable {

    String summary;
    String modifiedSummary;

    TitleCaseThread(String summary) {
        this.summary = summary;
    }

    @Override
    public void run() {

        String[] data = summary.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < data.length; i++) {
            sb.append(Character.toUpperCase(data[i].charAt(0)))
                    .append(data[i].substring(1)).append(" ");
        }

        modifiedSummary = sb.toString().trim();
    }

    public String getModifiedSummary() {
        return modifiedSummary;
    }
}
