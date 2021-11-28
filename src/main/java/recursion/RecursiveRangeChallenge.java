package recursion;

public class RecursiveRangeChallenge {

    public int recursiveRange(int num) {
        if (num < 0) {
            return -1;
        }
        if (num == 0) {
            return 0;
        }
        return num + recursiveRange(num - 1);
    }
}
