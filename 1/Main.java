package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        String str3 = scanner.next();
        System.out.println("Dlina " + str1 + " - " + str1.length());
        System.out.println("Dlina " + str2 + " - " + str2.length());
        System.out.println("Dlina " + str3 + " - " + str3.length());
    }
}
