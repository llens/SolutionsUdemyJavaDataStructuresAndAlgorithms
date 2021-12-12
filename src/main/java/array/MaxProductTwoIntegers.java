package array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;

public class MaxProductTwoIntegers {

  private MaxProductTwoIntegers() {}

  static String maxProductTwoIntegers(int[] intArray) {
    AtomicInteger i = new AtomicInteger(1);
    return Arrays.stream(Arrays.copyOfRange(intArray, 0, intArray.length - 1))
        .mapToObj(
            it ->
                Arrays.stream(Arrays.copyOfRange(intArray, i.getAndIncrement(), intArray.length))
                    .mapToObj(it2 -> Arrays.asList(it, it2))
                    .toList())
        .flatMap(Collection::stream)
        .max(Comparator.comparing(pair -> pair.get(0) * pair.get(1)))
        .orElse(Arrays.asList(-1, -1))
        .toString();
  }
}
