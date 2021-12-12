package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PermutationTest {

    @Test
    void testIsPermutation() {
        assertTrue(Permutation.isPermutation(new int[] {1, 2, 3, 4, 5}, new int[] {5, 1, 2, 3, 4}));
    }

    @Test
    void testNotPermutation() {
        assertFalse(Permutation.isPermutation(new int[] {1, 2, 3, 4, 5}, new int[] {6, 1, 2, 3, 4}));
    }


}