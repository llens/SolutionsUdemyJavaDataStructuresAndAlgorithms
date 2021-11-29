package recursion;

import static org.junit.jupiter.api.Assertions.*;

class RecursionExampleTest {

  @org.junit.jupiter.api.Test
  void testFactorial() {
    assertEquals(6, RecursionExample.factorial(3));
  }

  @org.junit.jupiter.api.Test
  void testFactorial2() {
    assertEquals(-1, RecursionExample.factorial(-3));
  }
}
