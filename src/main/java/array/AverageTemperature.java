package array;

import java.util.Arrays;

public class AverageTemperature {

  private AverageTemperature() {}

  public static double averageTemperatureV1(int[] temps) {
    int numDays = temps.length;
    int sum = 0;
    for (int next : temps) {
      sum += next;
    }
    return ((double) sum) / numDays;
  }

  public static double averageTemperatureV2(int[] temps) {
    int numDays = temps.length;
    int sum = 0;
    for (int next : temps) {
      sum += next;
    }
    int finalSum = sum;
    return Arrays.stream(temps).filter(temp -> temp > ((double) finalSum) / numDays).count();
  }
}
