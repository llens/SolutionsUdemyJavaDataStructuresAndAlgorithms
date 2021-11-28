package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseChallengeTest {

    ReverseChallenge reverseChallenge = new ReverseChallenge();

    @Test
    void reverseTest() {
        assertEquals("tset", reverseChallenge.reverse("test"));
    }
}