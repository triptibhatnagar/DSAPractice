import java.util.Arrays;

public class RotateMatrixBy90 {
    // T: O(N^2 + N^2), S: O(N^2)
    static void rotateBy90_brute(int matrix[][]) {
        int n = matrix.length;
        int temp[][] = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                temp[j][n-i-1] = matrix[i][j];
            }
        }
        for(int i=0; i<n; i++) {
            System.arraycopy(temp[i], 0, matrix[i], 0, n);
        }
    }
    
    // T: O(N^2 + N^2), S:O(1)
    static void rotateBy90_opt(int matrix[][]) {
        int n = matrix.length;
        for(int i=1; i<n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        // rotateBy90_brute(matrix);
        rotateBy90_opt(matrix);
        for(int[] x: matrix) {
            System.out.println(Arrays.toString(x));
        }
        /*
         * [1,4,7]
         * [2,5,8]
         * [3,6,9]
         */
        // [
        //  [7, 4, 1], 
        //  [8, 5, 2], 
        //  [9, 6, 3]
        // ]
    }
}