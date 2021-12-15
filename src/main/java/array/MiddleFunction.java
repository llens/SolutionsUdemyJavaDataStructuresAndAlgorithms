package array;

import java.util.Arrays;

public class MiddleFunction {

    private MiddleFunction() {}

    static int[] middle(int[] arr) {
        return Arrays.copyOfRange(arr, 1, arr.length - 1);
    }
}
