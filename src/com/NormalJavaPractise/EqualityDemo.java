package com.NormalJavaPractise;

public class EqualityDemo {
    public static void main(String[] args) {

        String str1 = new String("Hello");
        String str2 = new String("Hello");

        if (str1 == str2) {
            System.out.println("String1 == String2 is true");
        } else {
            System.out.println("String1 == String2 is false");
        }


        if (str1.equals(str2)) {
            System.out.println("String1.equals(String2) is true");
        } else {
            System.out.println("String1.equals(String2) is false");
        }

        String str3 = str2;

        if (str3 == str2) {
            System.out.println("String2 == String3 is true");
        } else {
            System.out.println("String2 == String3 is false");
        }

        if (str3.equals(str2)) {
            System.out.println("String3.equals(String2) is true");
        } else {
            System.out.println("String3.equals(String2) is false");
        }
    }
}
