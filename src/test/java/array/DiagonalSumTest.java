package array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiagonalSumTest {

  @Test
  void diagonalSum() {
    assertEquals(15, DiagonalSum.sumDiagonal(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
  }
}
