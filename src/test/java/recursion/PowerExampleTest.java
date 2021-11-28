package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerExampleTest {

    private PowerExample powerExample = new PowerExample();

    @Test
    void testPower() {
        assertEquals(8, powerExample.power(2, 3));
    }

    @Test
    void testPower2() {
        assertEquals(1.0/8, powerExample.power(2, -3));
    }

    @Test
    void testPower3() {
        assertEquals(4, powerExample.power(2, 2));
    }

    @Test
    void testPower4() {
        assertEquals(1.0/4, powerExample.power(2, -2));
    }
}