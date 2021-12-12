package array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IsUniqueTest {

  @Test
  void isUniqueTest() {
    assertTrue(IsUnique.isUnique(new int[] {1, 2, 3, 4, 5, 6}));
  }

  @Test
  void notUniqueTest() {
    assertFalse(IsUnique.isUnique(new int[] {1, 2, 2, 3, 4, 5, 6}));
  }
}
