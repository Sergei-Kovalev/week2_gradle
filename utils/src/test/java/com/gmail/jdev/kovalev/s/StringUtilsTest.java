package com.gmail.jdev.kovalev.s;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    private final StringUtils stringUtils = new StringUtils();

    @Test
    void isPositiveNumberWithPositive() {
        assertTrue(stringUtils.isPositiveNumber("4"));
    }
    @Test
    void isPositiveNumberWithNegative() {
        assertFalse(stringUtils.isPositiveNumber("-5"));
    }
    @Test
    void isPositiveNumberWithNonNumber() {
        assertThrows(NumberFormatException.class, () -> stringUtils.isPositiveNumber("I'm not a number!"));
    }
}