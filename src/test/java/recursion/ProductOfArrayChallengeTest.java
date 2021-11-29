package recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductOfArrayChallengeTest {

  @Test
  void productOfArray() {
    assertEquals(6, ProductOfArrayChallenge.productOfArray(new int[] {1, 2, 3}, 3));
  }
}
