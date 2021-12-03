package time_complexity;

public class ReverseArray {

  private ReverseArray() {}

  public static int[] reverseArray(int[] input) {
    for (int i = 0; i < input.length / 2; i++) {
      int other = input.length - i - 1;
      int temp = input[i];
      input[i] = input[other];
      input[other] = temp;
    }
    return input;
  }
}
