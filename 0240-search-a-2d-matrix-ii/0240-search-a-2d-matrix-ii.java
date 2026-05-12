class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int row = matrix.length - 1, col = matrix[0].length - 1;
        int low = 0, high = col;
        while (low <= row && high >= 0) {
            if (matrix[low][high] == target) {
                return true;
            } else if (matrix[low][high] < target) {
                low++;
            } else {
                high--;
            }
        }
        return false;
    }
}