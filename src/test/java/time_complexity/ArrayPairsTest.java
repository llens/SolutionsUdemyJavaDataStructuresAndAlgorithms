package time_complexity;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import util.Pair;

class ArrayPairsTest {

  @Test
  void arrayPairsTest() {
    assertEquals(
        Arrays.asList(
            Pair.of(1, 3),
            Pair.of(1, 4),
            Pair.of(1, 5),
            Pair.of(3, 4),
            Pair.of(3, 5),
            Pair.of(4, 5)),
        ArrayPairs.pairsFromArray(new int[] {1, 3, 4, 5}));
  }
}
