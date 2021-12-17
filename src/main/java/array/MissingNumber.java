package array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingNumber {

  private MissingNumber() {}

  public static int missingNumber(int[] intArray, int n) {
    return IntStream.range(1, n + 1).sum() - Arrays.stream(intArray).sum();
  }
}
