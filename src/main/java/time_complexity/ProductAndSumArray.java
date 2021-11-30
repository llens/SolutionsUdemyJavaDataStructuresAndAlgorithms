package time_complexity;

public class ProductAndSumArray {

  private ProductAndSumArray() {}

  static ProductSum spofArray(int[] array) {
    int sum = 0;
    int product = 1;
    for (int k : array) {
      sum += k;
    }
    for (int j : array) {
      product *= j;
    }
    return new ProductSum(product, sum);
  }
}
