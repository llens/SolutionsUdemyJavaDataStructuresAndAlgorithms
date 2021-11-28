package recursion;

import static org.junit.jupiter.api.Assertions.*;

class RecursionExampleTest {

    private final RecursionExample recursionExample = new RecursionExample();

    @org.junit.jupiter.api.Test
    void testFactorial() {
        assertEquals(6, recursionExample.factorial(3));
    }

    @org.junit.jupiter.api.Test
    void testFactorial2() {
        assertEquals(-1, recursionExample.factorial(-3));
    }
}