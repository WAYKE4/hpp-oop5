package com.company;

public class Main {
    public static void main(String[] args) {
        String name = "Hello";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            sb.append(name.charAt(i)).append(name.charAt(i));
        }
        System.out.println(sb);
    }
}