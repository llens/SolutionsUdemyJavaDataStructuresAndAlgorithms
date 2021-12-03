package time_complexity;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import util.Pair;

public class ArrayPairs {

  private ArrayPairs() {}

  public static List<Map.Entry<Integer, Integer>> pairsFromArray(int[] array) {
    return Arrays.stream(array)
        .mapToObj( // O(N)
            entry ->
                Arrays.stream(array) // O(N)
                    .mapToObj(entryInner -> Pair.of(entry, entryInner))
                    .toList())
        .flatMap(Collection::stream)
        .toList();
  }
  // O(N) * O(N) -> O(N^2)
}
