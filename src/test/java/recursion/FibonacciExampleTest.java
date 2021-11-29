package recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciExampleTest {

  @Test
  void fibonacciTest() {
    assertEquals(2, FibonacciExample.fibonacci(3));
  }

  @Test
  void fibonacciTest2() {
    assertEquals(-1, FibonacciExample.fibonacci(-2));
  }
}
