package codility;

import java.util.Arrays;

public class FindMinumum {

    public static int findMinimum(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int k = 0; k < n; k++) {
            if (i <= m - 1 && B[i] < A[k]) // tutaj
                i += 1; k = 0; //i tutaj
            if (A[k] == B[i])
                return A[k];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {10, 7, 3, 23, 48, 21};
        System.out.println(findMinimum(A, B));
    }
}
