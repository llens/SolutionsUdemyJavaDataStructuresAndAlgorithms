package array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BestScoreTest {

  @Test
  void firstSecondTest() {
    assertEquals(
        "90 87",
        BestScore.firstSecond(new Integer[] {84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0}));
  }
}
