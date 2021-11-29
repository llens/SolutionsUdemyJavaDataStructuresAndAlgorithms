package recursion;

public class PalindromeChallenge {

    private PalindromeChallenge() {}

    public static boolean isPalindrome(String s) {
        char[] sa = s.toCharArray();
        if (s.length() <= 1) {
            return true;
        }
        if (sa[0] == sa[s.length() - 1]) {
            return isPalindrome(s.substring(1, s.length() - 1));
        }
        return false;
    }
}
