package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciExampleTest {

    private FibonacciExample fibonacciExample = new FibonacciExample();

    @Test
    void fibonacciTest() {
        assertEquals(2, fibonacciExample.fibonacci(3));
    }

    @Test
    void fibonacciTest2() {
        assertEquals(-1, fibonacciExample.fibonacci(-2));
    }

}