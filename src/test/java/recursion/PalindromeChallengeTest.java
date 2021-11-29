package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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