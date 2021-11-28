package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecimalToBinaryExampleTest {

    DecimalToBinaryExample decimalToBinaryExample = new DecimalToBinaryExample();

    @Test
    void decimalToBinaryConversion() {
        assertEquals(10, decimalToBinaryExample.decimalToBinary(2));
    }

    @Test
    void decimalToBinaryConversion2() {
        assertEquals(1101, decimalToBinaryExample.decimalToBinary(13));
    }

    @Test
    void decimalToBinaryConversion3() {
        assertEquals(-1101, decimalToBinaryExample.decimalToBinary(-13));
    }

}