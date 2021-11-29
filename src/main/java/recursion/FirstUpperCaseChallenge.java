package recursion;

public class FirstUpperCaseChallenge {

    public static char first(String str) {
        char[] chars = str.toCharArray();
        return  Character.isUpperCase(chars[0]) ? chars[0] : first(str.substring(1));
    }
}
