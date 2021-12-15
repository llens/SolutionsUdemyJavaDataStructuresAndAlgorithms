package array;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Permutation {

  private Permutation() {}

  static boolean isPermutation(int[] array1, int[] array2) {
    return Arrays.stream(array1)
        .boxed()
        .collect(Collectors.toSet())
        .equals(Arrays.stream(array2).boxed().collect(Collectors.toSet()));
  }
}
