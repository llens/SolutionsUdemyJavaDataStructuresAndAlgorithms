package recursion;

public class GreatestCommonDivisorExample {

  private GreatestCommonDivisorExample() {}

  public static int greatestCommonDivisor(int a, int b) {
    if (a < 0 || b < 0) {
      return -1;
    }
    if (b == 0) {
      return a;
    }
    return greatestCommonDivisor(b, a % b);
  }
}
