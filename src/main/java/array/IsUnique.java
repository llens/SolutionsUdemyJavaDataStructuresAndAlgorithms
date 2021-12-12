package array;

import java.util.Arrays;

public class IsUnique {

  private IsUnique() {}

  static boolean isUnique(int[] intArray) {
    return intArray.length == Arrays.stream(intArray).boxed().distinct().toArray().length;
  }
}
