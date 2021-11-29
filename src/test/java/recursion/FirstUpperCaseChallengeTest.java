package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstUpperCaseChallengeTest {

    @Test
    void firstUpperTest() {
        assertEquals('S', FirstUpperCaseChallenge.first("appmillerS"));
    }
}
