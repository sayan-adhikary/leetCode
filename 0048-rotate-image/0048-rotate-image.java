class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Initialize new matrix to store rotated values
        int[][] rotated = new int[n][n];

        // Perform rotation logic
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - i - 1] = matrix[i][j];
            }
        }

        // Copy rotated elements to original matrix
        for (int i = 0; i < n; i++) {
            System.arraycopy(rotated[i], 0, matrix[i], 0, n);
        }
    }
}