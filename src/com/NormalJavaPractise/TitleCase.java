package com.NormalJavaPractise;

//Making 1st letter of every word to Uppercase in a given line.
public class TitleCase {

    public static String toTitleCase(String givenString) {

        String[] arr = givenString.split(" ");
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            sb.append(Character.toUpperCase(arr[i].charAt(0)))
                    .append(arr[i].substring(1)).append(" ");
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String result = toTitleCase("ram is a good boy");
//        System.out.println(result);

    }
}
