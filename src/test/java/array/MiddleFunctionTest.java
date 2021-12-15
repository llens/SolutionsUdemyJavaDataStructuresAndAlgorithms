package array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MiddleFunctionTest {

  @Test
  void middleFunctionTest() {
    assertArrayEquals(new int[] {2, 3}, MiddleFunction.middle(new int[] {1, 2, 3, 4}));
  }
}
