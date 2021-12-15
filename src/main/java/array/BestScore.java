package array;

public class BestScore {

  private BestScore() {}

  static String firstSecond(Integer[] myArray) {
    Integer first = null;
    Integer second = null;
    for (Integer integer : myArray) {
      if (first == null || integer > first) {
        second = first;
        first = integer;
      } else if (second == null || integer > second) {
        second = integer;
      }
    }
    String output = "";
    if (first != null) {
      output += first.toString();
    }
    if (second != null) {
      output += " " + second.toString();
    }
    return output;
  }
}
