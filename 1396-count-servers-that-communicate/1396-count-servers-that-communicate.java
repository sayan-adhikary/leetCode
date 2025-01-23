public class Solution {

    private static final int MAX_ROWS = 250;
    private static final int MAX_COLUMNS = 250;

    public int countServers(int[][] grid) {
        int[] serversInRow = new int[MAX_ROWS + 1];
        int[] serversInColumn = new int[MAX_COLUMNS + 1];

        for (int r = 0; r < grid.length; ++r) {
            for (int c = 0; c < grid[0].length; ++c) {
                if (grid[r][c] == 1) {
                    ++serversInRow[r];
                    ++serversInColumn[c];
                }
            }
        }

        int connectedServers = 0;
        for (int r = 0; r < grid.length; ++r) {
            for (int c = 0; c < grid[0].length; ++c) {
                if (grid[r][c] == 1 && (serversInRow[r] > 1 || serversInColumn[c] > 1)) {
                    ++connectedServers;
                }
            }
        }
        return connectedServers;
    }
}