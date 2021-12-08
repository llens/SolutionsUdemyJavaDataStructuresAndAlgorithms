package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {

    @Test
    void testMissingNumber() {
        assertEquals(7, MissingNumber.missingNumber(new int[] {1, 2, 3, 4, 5, 6,  8, 9, 10}));
    }

}