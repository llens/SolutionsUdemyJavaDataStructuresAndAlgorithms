package recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfDigitsExampleTest {

  @Test
  void sumOfDigitsTest() {
    assertEquals(4, SumOfDigitsExample.sumOfDigits(4));
  }

  @Test
  void sumOfDigitsTestTwo() {
    assertEquals(1, SumOfDigitsExample.sumOfDigits(10));
  }

  @Test
  void sumOfDigitsTestThree() {
    assertEquals(0, SumOfDigitsExample.sumOfDigits(-1));
  }
}
