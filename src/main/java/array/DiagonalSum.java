package array;

public class DiagonalSum {

  private DiagonalSum() {}

  static int sumDiagonal(int[][] a) {
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i][i];
    }
    return sum;
  }
}
