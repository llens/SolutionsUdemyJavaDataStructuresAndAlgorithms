package recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeChallengeTest {

  @Test
  void isPalindromeTest() {
    assertFalse(PalindromeChallenge.isPalindrome("test"));
  }

  @Test
  void isPalindromeTest2() {
    assertTrue(PalindromeChallenge.isPalindrome("tsest"));
  }

  @Test
  void isPalindromeTest3() {
    assertTrue(PalindromeChallenge.isPalindrome("tsst"));
  }
}
