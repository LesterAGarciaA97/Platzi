package com.platzi.javatests.util;

public class StringUtil {
    public static String repeat(String str, int times) {
        //return null;
        String result = "";

        for (int i = 0; i < times ; i++) {
            result += str;
        }
        return result;
    }
}