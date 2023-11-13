package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = new String[3];
        double resultLen = 0;
        for (int i = 0; i < str.length; i++) {
            str[i] = scanner.next();
            resultLen += str[i].length();
        }
        int resultLenFinal = (int) (Math.round(resultLen / 3));
        System.out.println("Srednaya dlina - " + resultLenFinal);
        if (str[0].length() <= resultLenFinal) {
            System.out.println(str[0] + " - " + str[0].length());
        }
        if (str[1].length() <= resultLenFinal) {
            System.out.println(str[1] + " - " + str[1].length());
        }
        if (str[2].length() <= resultLenFinal) {
            System.out.println(str[2] + " - " + str[2].length());
        }
    }
}