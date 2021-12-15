package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleFunctionTest {

    @Test
    void middleFunctionTest() {
        assertArrayEquals(new int[] {2, 3}, MiddleFunction.middle(new int[] {1, 2, 3, 4}));
    }

}