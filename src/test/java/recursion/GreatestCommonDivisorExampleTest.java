package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorExampleTest {

    private final GreatestCommonDivisorExample greatestCommonDivisorExample = new GreatestCommonDivisorExample();

    @Test
    void greatestCommonDivisorTest() {
        assertEquals(2, greatestCommonDivisorExample.greatestCommonDivisor(48, 18));
    }

    @Test
    void greatestCommonDivisorTest2() {
        assertEquals(4, greatestCommonDivisorExample.greatestCommonDivisor(8, 4));
    }

}