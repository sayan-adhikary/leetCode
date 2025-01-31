class Solution {
    public int largestIsland(int[][] grid) {
        //the largest island can be created in two ways
            //by joining two disconnected islands that have a gap of 1 cell in between them
            //or by taking the size of the largest component on the graph and adding 1 to it (so we just flip an adjacent cell from 0 to 1)
        //the first case is where the bulk of the work will be
            //on top of finding the sizes of each disconnected island on the graph, we have to figure out which of them is close to others with a gap of 1.

        //We can use DFS to find every ith component, number all its cells to i, and indicate its size in some sort of an array or map
        //then we can go through each element in the matrix that is currently a 0, flip it to be a land cell, and see if it connects any two/three/four islands together. if it does, then the current sum of land is just the sum of the sizes of all the islands + 1

        Map<Integer,Integer> islandSizes = new HashMap<>();
        int islandNum = 2; //start with 2. 1 means unvisited land cell, and 0 means not a land cell.
        int maxIslandSize = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] != 1)
                    continue;
                islandSizes.put(islandNum, dfs(islandNum, grid, i,j));
                islandNum++;
            }
        }

        //these two if statements speed up the time by a lot since they saves a huge overhead below
        if(islandSizes.size() == 0)
            return 1; //no islands to connect. just return 1.
        if(islandSizes.size() == 1){ //just one island
            int s = islandSizes.get(islandNum-1);
            if(s == grid.length * grid[0].length)
                return s;
            return s+1;
        }

        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] != 0)
                    continue;
                
                //4 directionally identify which islands this cell will connect
                //set is important. we don't want to check the same island more than once.
                Set<Integer> neighboringIslands = new HashSet<>(); 
                byte[] di = new byte[] {1,0,-1,0};
                byte[] dj = new byte[] {0,-1,0,1};
                for(int k = 0; k < 4; k++){
                    int ni = i + di[k];
                    int nj = j + dj[k];
                    if(ni < 0 || nj < 0 || ni >= grid.length || nj >= grid[0].length)
                        continue;
                    neighboringIslands.add(grid[ni][nj]); 
                }
                int potentialIslandSize = 0;
                for(Integer island: neighboringIslands)
                    potentialIslandSize += islandSizes.getOrDefault(island,0);
                
                potentialIslandSize++;
                maxIslandSize = potentialIslandSize  > maxIslandSize ? potentialIslandSize : maxIslandSize;
            }
        }
        return maxIslandSize;
    }
    public int dfs(int islandNum, int[][] grid, int i, int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == islandNum || grid[i][j] == 0)
            return 0;
        grid[i][j] = islandNum;
        int size = 1;
        size += dfs(islandNum, grid, i+1,j);
        size += dfs(islandNum, grid, i-1,j);
        size += dfs(islandNum, grid, i,j+1);
        size += dfs(islandNum, grid, i,j-1);
        return size;
    }
}