package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDigitsExampleTest {

    private SumOfDigitsExample sumOfDigitsExample = new SumOfDigitsExample();

    @Test
    void sumOfDigitsTest() {
        assertEquals(4, sumOfDigitsExample.sumOfDigits(4));
    }

    @Test
    void sumOfDigitsTestTwo() {
        assertEquals(1, sumOfDigitsExample.sumOfDigits(10));
    }

    @Test
    void sumOfDigitsTestThree() {
        assertEquals(0, sumOfDigitsExample.sumOfDigits(-1));
    }
}