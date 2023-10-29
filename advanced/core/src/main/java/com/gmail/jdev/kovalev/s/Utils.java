package com.gmail.jdev.kovalev.s;

public class Utils {
    private final static StringUtils stringUtils = new StringUtils();
     static boolean isAllPositiveNumbers(String... str) {
        for (String s : str) {
            if (!stringUtils.isPositiveNumber(s)) {
                return false;
            }
        }
        return true;
    }
}
