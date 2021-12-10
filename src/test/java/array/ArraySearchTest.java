package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySearchTest {

    @Test
    void testArraySearch() {
        assertEquals(5, ArraySearch.searchInArray(new int[] {1, 2, 3, 4, 5, 6}, 6));
    }

    @Test
    void testArraySearchTwo() {
        assertEquals(4, ArraySearch.searchInArray(new int[] {1, 2, 3, 4, 5, 6}, 5));
    }

}