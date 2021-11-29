package recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreatestCommonDivisorExampleTest {

  @Test
  void greatestCommonDivisorTest() {
    assertEquals(6, GreatestCommonDivisorExample.greatestCommonDivisor(48, 18));
  }

  @Test
  void greatestCommonDivisorTest2() {
    assertEquals(4, GreatestCommonDivisorExample.greatestCommonDivisor(8, 4));
  }
}
