class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int row = mat.length, col = mat[0].length;
        int low = 0, high = row * col - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int i_row = mid / col;
            int j_col = mid % col;
            if (mat[i_row][j_col] == target)
                return true;
            else if (mat[i_row][j_col] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
