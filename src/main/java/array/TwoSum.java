package array;

import java.util.ArrayList;

public class TwoSum {

  private TwoSum() {}

  static int[] twoSum(int[] numbs, int target) {
    ArrayList<Integer> pairIndices = new ArrayList<>();
    for (int i = 0; i < numbs.length - 1; i++) {
      for (int j = i + 1; j < numbs.length; j++) {
        if (target == numbs[i] + numbs[j]) {
          pairIndices.add(i);
          pairIndices.add(j);
        }
      }
    }
    return pairIndices.stream().mapToInt(it -> it).toArray();
  }
}
