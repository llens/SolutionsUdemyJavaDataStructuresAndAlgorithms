package recursion;

public class RecursiveRangeChallenge {

    private RecursiveRangeChallenge() {}

    public static int recursiveRange(int num) {
        if (num < 0) {
            return -1;
        }
        if (num == 0) {
            return 0;
        }
        return num + recursiveRange(num - 1);
    }
}
