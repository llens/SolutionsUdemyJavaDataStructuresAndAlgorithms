package array;

public class PairSum {

  private PairSum() {}

  static String pairSum(int[] numbs, int target) {
    StringBuilder output = new StringBuilder();
    for (int i = 0; i < numbs.length; i++) {
      for (int j = i; j < numbs.length; j++) {
        if (target == numbs[i] + numbs[j]) {
          output.append(numbs[i]).append(":").append(numbs[j]).append(" ");
        }
      }
    }
    return output.toString();
  }
}
