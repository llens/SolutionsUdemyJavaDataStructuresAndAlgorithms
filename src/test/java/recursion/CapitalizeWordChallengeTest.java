package recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CapitalizeWordChallengeTest {

  @Test
  void testCapitalize() {
    assertEquals("Test Upper", CapitalizeWordChallenge.capitalizeWord("test upper"));
  }
}
