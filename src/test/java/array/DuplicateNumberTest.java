package array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DuplicateNumberTest {

  @Test
  void removeDuplicatesTest() {
    assertArrayEquals(
        new int[] {1, 2, 3, 4, 5},
        DuplicateNumber.removeDuplicates(new int[] {1, 1, 2, 2, 3, 4, 5}));
  }
}
