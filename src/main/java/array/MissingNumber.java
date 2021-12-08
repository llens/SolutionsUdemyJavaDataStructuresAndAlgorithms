package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumber {

    private MissingNumber() {}

    public static int missingNumber(int[] intArray) {
        HashSet<Integer> oneToTen = IntStream.range(1, 10).boxed().collect(Collectors.toCollection(HashSet::new));
        oneToTen.removeAll(new HashSet<>(Arrays.stream(intArray).boxed().toList()));
        return oneToTen.stream().findFirst().orElse(-1);
    }
}
