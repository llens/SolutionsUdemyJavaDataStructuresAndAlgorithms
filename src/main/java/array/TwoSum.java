package array;

import java.util.ArrayList;

public class TwoSum {

  private TwoSum() {}

  static int[] twoSum(int[] nums, int target) {
    ArrayList<Integer> pairIndices = new ArrayList<>();
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (target == nums[i] + nums[j]) {
          pairIndices.add(i);
          pairIndices.add(j);
        }
      }
    }
    return pairIndices.stream().mapToInt(it -> it).toArray();
  }
}
