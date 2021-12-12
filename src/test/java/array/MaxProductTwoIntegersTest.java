package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProductTwoIntegersTest {

    @Test
    void maxProductTwoIntegersTest() {
        assertEquals("[40, 50]", MaxProductTwoIntegers.maxProductTwoIntegers(new int[] {10, 20, 30, 40, 50}));
    }

}