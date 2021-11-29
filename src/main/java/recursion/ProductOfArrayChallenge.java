package recursion;

public class ProductOfArrayChallenge {

  private ProductOfArrayChallenge() {}

  public static int productOfArray(int[] a, int n) {
    if (n < 0) {
      return -1;
    }
    if (n == 0) {
      return a[0];
    }
    return a[n - 1] * productOfArray(a, n - 1);
  }
}
