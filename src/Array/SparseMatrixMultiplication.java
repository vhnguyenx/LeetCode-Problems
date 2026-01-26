package Array;

public class SparseMatrixMultiplication {
    public int[][] multiply(int[][] mat1, int[][] mat2) {
        int n = mat1.length;
        int m = mat2[0].length;
        int k = mat1[0].length;
        int[][] result = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int multiply = 0;

                for (int col = 0; col < k; col++) {
                    multiply += mat1[i][col] * mat2[col][j];
                }

                result[i][j] = multiply;
            }
        }

        return result;
    }
}
