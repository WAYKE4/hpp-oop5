package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = new String[3];
        for (int i = 0; i < str.length; i++) {
            str[i] = scanner.next();
        }
        for (String str0 : str) {
            if (Unique.Uniq(str0)) {
                System.out.println("Pervoe Slovo , kotoroe sostoit tolbko iz ynikalbnix simvolov -  " + str0);
                break;
            }
        }
    }
}