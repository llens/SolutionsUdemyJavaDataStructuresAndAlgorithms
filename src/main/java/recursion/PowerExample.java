package recursion;

public class PowerExample {

    public float power(int n, int pow) {
        if (pow > 0) {
            return n * power(n, pow - 1);
        } else if (pow == 0) {
            return 1;
        } else { // Not included in lectures, but come on its no work to include.
            return power(n, pow + 1) / n;
        }
    }
}
