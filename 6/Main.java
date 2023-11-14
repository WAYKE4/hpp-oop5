package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite stroky do 5 slov...");
        String str = scanner.nextLine();
        //  if (scanner.hasNextDouble()) { // Bag s scannerom ( 2 raza nado vvoditb )
        //      System.out.println("Neverno vvedena stroka");
        //      System.exit(0);
        //  }
        int count = 0;
        String[] word = str.split(" ");
        for (String lala : word) {
            //System.out.println(lala);
            count++;
        }
        if (count > 5) {
            System.out.println("Vvedeno bolbshe 4em 5 slov");
            System.exit(1);
        }
        System.out.println("Kakoe slovo proverit' na palindrom?");
        int num = scanner.nextInt();
        switch (num) {
            case 1 -> {
                if (word[0] == null) {
                    System.out.println("Netu slova pod etim nomerom");
                    System.exit(0);
                }
                if (Palindrome.isPalindrome(word[0])) {
                    System.out.println("Da , eto polindrom");
                } else {
                    System.out.println("Net , ne polindrom");
                }
            }
            case 2 -> {
                if (word[1] == null) {
                    System.out.println("Netu slova pod etim nomerom");
                    System.exit(0);
                }
                if (Palindrome.isPalindrome(word[1])) {
                    System.out.println("Da , eto polindrom");
                } else {
                    System.out.println("Net , ne polindrom");
                }
            }
            case 3 -> {
                if (word[2] == null) {
                    System.out.println("Netu slova pod etim nomerom");
                    System.exit(0);
                }
                if (Palindrome.isPalindrome(word[2])) {
                    System.out.println("Da , eto polindrom");
                } else {
                    System.out.println("Net , ne polindrom");
                }
            }
            case 4 -> {
                if (word[3] == null) {
                    System.out.println("Netu slova pod etim nomerom");
                    System.exit(0);
                }
                if (Palindrome.isPalindrome(word[3])) {
                    System.out.println("Da , eto polindrom");
                } else {
                    System.out.println("Net , ne polindrom");
                }
            }
            case 5 -> {
                if (word[4] == null) {
                    System.out.println("Netu slova pod etim nomerom");
                    System.exit(0);
                }
                if (Palindrome.isPalindrome(word[4])) {
                    System.out.println("Da , eto polindrom");
                } else {
                    System.out.println("Net , ne polindrom");
                }
            }
            default -> System.out.println("Ne pravilno vveden nomer 4isla");
        }
    }
}