package recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeRecursiveChallengeTest {

  private SomeRecursiveChallenge someRecursiveChallenge = new SomeRecursiveChallenge();

  @Test
  void someRecursiveTest() {
    assertTrue(someRecursiveChallenge.someRecursive(new int[] {1, 2, 3, 4}, new OddFunction()));
  }

  @Test
  void someRecursiveTest2() {
    assertFalse(someRecursiveChallenge.someRecursive(new int[] {2, 4}, new OddFunction()));
  }
}
