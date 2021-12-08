package array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AverageTemperatureTest {

  @Test
  void testAverageTemperature() {
    assertEquals(50, AverageTemperature.averageTemperatureV1(new int[] {49, 50, 51}));
  }

  @Test
  void testAverageTemperatureV2() {
    assertEquals(2, AverageTemperature.averageTemperatureV2(new int[] {48, 49, 50, 51, 52}));
  }
}
