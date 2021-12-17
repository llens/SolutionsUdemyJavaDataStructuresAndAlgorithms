package array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PairSumTest {

  @Test
  void testPairSum() {
    assertEquals(
        "2:5 4:3 3:4 -2:9 ", PairSum.pairSum(new int[] {2, 4, 3, 5, 6, -2, 4, 7, 8, 9}, 7));
  }

  @Test
  void testPairSum2() {
    assertEquals("2:5 4:3 3:4 ", PairSum.pairSum(new int[] {2, 4, 3, 5, 6, -2, 4, 7, 8}, 7));
  }
}
