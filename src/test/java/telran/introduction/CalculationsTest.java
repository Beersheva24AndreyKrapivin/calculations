package telran.introduction;

import static org.junit.jupiter.api.Assertions.*;
import static telran.introduction.Calculations.*;

import org.junit.jupiter.api.Test;

public class CalculationsTest {
    @Test
    void sumTest() {
        assertEquals(4, sum(2, 2));
    }

    @Test
    void multiplyTest() {
        assertEquals(4, multiply(2, 2));
    }

    @Test
    void divideTest() {
        assertEquals(3, divide(6, 2));
    }

    @Test
    void subtractTest() {
        assertEquals(4, subtract(6, 10));
    }

    @Test
    void sumOfDigitsTest() {
        assertEquals(20, sumOfDigits(553331));
    }

    @Test
    void maxDigitTest() {
        assertEquals(7, maxDigit(2347345));
    }

    @Test
    void isDivideOnTest() {
        assertEquals(true, isDivideOn(10, 5));
    }

}
