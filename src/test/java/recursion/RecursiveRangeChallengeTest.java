package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveRangeChallengeTest {

    RecursiveRangeChallenge recursiveRangeChallenge = new RecursiveRangeChallenge();

    @Test
    void recursiveRangeTest() {
        assertEquals(6, recursiveRangeChallenge.recursiveRange(3));
    }
}