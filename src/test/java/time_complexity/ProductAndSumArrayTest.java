package time_complexity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProductAndSumArrayTest {

  @Test
  void productSumTest() {
    ProductSum productSum = ProductAndSumArray.spofArray(new int[] {1, 3, 4, 5});
    assertEquals(13, productSum.sum());
    assertEquals(60, productSum.product());
  }
}
