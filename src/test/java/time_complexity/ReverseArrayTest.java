package time_complexity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseArrayTest {

  @Test
  void testReverseArray() {
    assertArrayEquals(new int[] {1, 2, 4, 6}, ReverseArray.reverseArray(new int[] {6, 4, 2, 1}));
  }
}
