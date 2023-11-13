package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = new String[3];
        for (int i = 0; i < str.length; i++) {
            str[i] = scanner.next();
        }
        if (str[0].length() > str[1].length() && str[0].length() > str[2].length()) {
            if (str[1].length() < str[2].length()) {
                System.out.println(str[1] + " - " + str[1].length());
                System.out.println(str[2] + " - " + str[2].length());
            } else {
                System.out.println(str[2] + " - " + str[2].length());
                System.out.println(str[1] + " - " + str[1].length());
            }
            System.out.println(str[0] + " -" + str[0].length());
        }
        if (str[1].length() > str[0].length() && str[1].length() > str[2].length()) {

            if (str[0].length() < str[2].length()) {
                System.out.println(str[0] + " - " + str[0].length());
                System.out.println(str[2] + " - " + str[2].length());
            } else {
                System.out.println(str[2] + " - " + str[2].length());
                System.out.println(str[0] + " - " + str[0].length());
            }
            System.out.println(str[1] + " - " + str[1].length());
        }
        if (str[2].length() > str[1].length() && str[2].length() > str[0].length()) {

            if (str[1].length() < str[0].length()) {
                System.out.println(str[1] + " - " + str[1].length());
                System.out.println(str[0] + " - " + str[0].length());
            } else {
                System.out.println(str[0] + " - " + str[0].length());
                System.out.println(str[1] + " - " + str[1].length());
            }
            System.out.println(str[2] + " -" + str[2].length());
        }
    }
}
