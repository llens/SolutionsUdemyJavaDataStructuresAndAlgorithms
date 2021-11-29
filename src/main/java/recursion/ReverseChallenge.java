package recursion;

public class ReverseChallenge {

    private ReverseChallenge() {}

    public static String reverse(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.toCharArray()[str.length() - 1] + reverse(str.substring(0, str.length() - 1));
    }
}
