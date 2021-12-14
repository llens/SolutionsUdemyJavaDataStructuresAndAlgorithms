package array;

public class RotateMatrix {

    private RotateMatrix() {}

    static int[][] rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            int last = n - 1 - i;
            for (int j = i; j < last; j++) {
                int offset = j - i;
                int top = matrix[i][j];
                matrix[i][j] = matrix[last-offset][i];
                matrix[last-offset][i] = matrix[last][last - offset];
                matrix[last][last - offset] = matrix[j][last];
                matrix[j][last] = top;
            }
        }
        return matrix;
    }
}
