package com.gmail.jdev.kovalev.s;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void isAllPositiveNumbers() {
        assertTrue(Utils.isAllPositiveNumbers("15", "22", "0"));
    }
}