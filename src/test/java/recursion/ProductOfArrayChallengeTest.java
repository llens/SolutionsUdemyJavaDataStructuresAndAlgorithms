package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayChallengeTest {

    ProductOfArrayChallenge productOfArrayChallenge = new ProductOfArrayChallenge();

    @Test
    void productOfArray() {
        assertEquals(6, productOfArrayChallenge.productOfArray(new int[]{1, 2, 3}, 3));
    }
}