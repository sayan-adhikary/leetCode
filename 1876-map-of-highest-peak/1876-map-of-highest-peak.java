class Solution {
    public int[][] highestPeak(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int[][] dp = new int[n][m];
        for(int x[] : dp)
            Arrays.fill(x, 100000);

        //top-ottom
        for(int i=0;i<n;i++){
            for(int j =0;j<m;j++){
                if(mat[i][j] == 1){
                    dp[i][j] = 0;
                    continue;
                }
                if(i>0){
                    dp[i][j] = Math.min(dp[i][j], dp[i-1][j]+1);
                }
                if(j>0){
                    dp[i][j] = Math.min(dp[i][j], dp[i][j-1]+1);
                }
            }
        }
        
        //bottom-up
        for(int i=n-1; i>=0; i--){
            for(int j=m-1;j>=0;j--){
                if(i<n-1){
                    dp[i][j] = Math.min(dp[i][j], dp[i+1][j]+1);
                }
                if(j<m-1){
                    dp[i][j]= Math.min(dp[i][j], dp[i][j+1]+1);
                }
            }
        }
        return dp;
    }
}