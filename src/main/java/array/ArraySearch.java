package array;

public class ArraySearch {

    private ArraySearch() {}

    static int searchInArray(int[] intArray, int valueToSearch) {
        for (int i = 0; i < intArray.length; i++) {
            if (valueToSearch == intArray[i]) {
                return i;
            }
        }
        return -1;
    }
}
