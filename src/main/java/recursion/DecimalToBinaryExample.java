package recursion;

public class DecimalToBinaryExample {

    private DecimalToBinaryExample() {}

    public static int decimalToBinary(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 2 + 10 * decimalToBinary(n / 2);
    }
}
