package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeChallengeTest {

    PalindromeChallenge palindromeChallenge = new PalindromeChallenge();

    @Test
    void isPalindromeTest() {
        assertEquals(false, palindromeChallenge.isPalindrome("test"));
    }

    @Test
    void isPalindromeTest2() {
        assertEquals(true, palindromeChallenge.isPalindrome("tsest"));
    }

    @Test
    void isPalindromeTest3() {
        assertEquals(true, palindromeChallenge.isPalindrome("tsst"));
    }
}