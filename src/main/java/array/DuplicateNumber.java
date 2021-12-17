package array;

import java.util.ArrayList;

public class DuplicateNumber {

  private DuplicateNumber() {}

  static int[] removeDuplicates(int[] arr) {
    ArrayList<Integer> output = new ArrayList<>();
    for (int j : arr) {
      if (!output.contains(j)) {
        output.add(j);
      }
    }
    return output.stream().mapToInt(Integer::intValue).toArray();
  }
}
