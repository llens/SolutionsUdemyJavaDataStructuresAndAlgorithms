package recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FirstUpperCaseChallengeTest {

  @Test
  void firstUpperTest() {
    assertEquals('S', FirstUpperCaseChallenge.first("appmillerS"));
  }
}
