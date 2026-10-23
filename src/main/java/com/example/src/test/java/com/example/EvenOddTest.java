
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EvenOddTest {

    @Test
    void testEven() {
        assertEquals("Even", EvenOdd.checkEvenOdd(4));
    }

    @Test
    void testOdd() {
        assertEquals("Odd", EvenOdd.checkEvenOdd(7));
    }

    @Test
    void testZero() {
        assertEquals("Even", EvenOdd.checkEvenOdd(0));
    }

    @Test
    void testNegativeEven() {
        assertEquals("Even", EvenOdd.checkEvenOdd(-4));
    }

    @Test
    void testNegativeOdd() {
        assertEquals("Odd", EvenOdd.checkEvenOdd(-3));
    }
}
