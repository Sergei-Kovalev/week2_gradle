package com.gmail.jdev.kovalev.s;

public class StringUtils {

    boolean isPositiveNumber(String str) throws NumberFormatException {
        long number = Long.parseLong(str);
        return number >= 0;
    }
}
