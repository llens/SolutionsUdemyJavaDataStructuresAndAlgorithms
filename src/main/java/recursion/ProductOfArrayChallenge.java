package recursion;

public class ProductOfArrayChallenge {

    public int productOfArray(int A[], int N) {
        if (N < 0) {
            return -1;
        }
        if (N == 0) {
            return A[0];
        }
        return A[N - 1] * productOfArray(A, N - 1);
    }
}
