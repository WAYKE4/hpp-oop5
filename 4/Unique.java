package com.company;

public class Unique {
    public static boolean Uniq(String str0) {
        for (int i = 0; i < str0.length(); i++) {
            for (int j = i + 1; j < str0.length(); j++) {
                if (str0.charAt(i) == str0.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
