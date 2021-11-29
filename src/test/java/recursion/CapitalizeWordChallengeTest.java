package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CapitalizeWordChallengeTest {

    @Test
    void testCapitalize() {
        assertEquals("Test Upper", CapitalizeWordChallenge.capitalizeWord("test upper"));
    }

}