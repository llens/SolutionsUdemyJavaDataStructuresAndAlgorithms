package recursion;

import java.util.Arrays;

public class SomeRecursiveChallenge {

  public boolean someRecursive(int[] arr, OddFunction odd) {
    if (arr.length == 1) {
      return odd.run(arr[0]);
    }
    return odd.run(arr[0]) || someRecursive(Arrays.copyOfRange(arr, 1, arr.length), odd);
  }
}
