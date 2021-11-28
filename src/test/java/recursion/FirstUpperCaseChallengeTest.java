package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstUpperCaseChallengeTest {

    FirstUpperCaseChallenge firstUpperCaseChallenge = new FirstUpperCaseChallenge();

    @Test
    void firstUpperTest() {
        assertEquals('S', firstUpperCaseChallenge.first("appmillerS"));
    }
}
