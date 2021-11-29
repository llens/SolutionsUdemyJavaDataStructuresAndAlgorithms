package recursion;

import java.util.Locale;

public class CapitalizeWordChallenge {

    private CapitalizeWordChallenge() {
    }

    public static String capitalizeWord(String str) {
        if (str.length() == 1 && !" ".equals(str)) {
            return str.toUpperCase(Locale.ROOT);
        }
        return capitalizeWord(str.substring(0, str.length() - 1)) +
                (" ".equals(str.substring(str.length() - 2, str.length() - 1))
                        ? str.substring(str.length() - 1).toUpperCase(Locale.ROOT)
                        : str.substring(str.length() - 1));
    }
}
