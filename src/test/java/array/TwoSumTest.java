package array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TwoSumTest {

  @Test
  void twoSumTest() {
    assertArrayEquals(new int[] {0, 1}, TwoSum.twoSum(new int[] {2, 7, 11, 15}, 9));
  }

  @Test
  void twoSumTestTwo() {
    assertArrayEquals(new int[] {1, 2}, TwoSum.twoSum(new int[] {3, 2, 4}, 6));
  }
}
