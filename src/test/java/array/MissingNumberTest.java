package array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MissingNumberTest {

  @Test
  void testMissingNumberVideoVersion() {
    assertEquals(
        7, MissingNumber.missingNumber(new int[] {1, 2, 3, 4, 5, 6, 8, 9, 10}, 10));
  }
}
