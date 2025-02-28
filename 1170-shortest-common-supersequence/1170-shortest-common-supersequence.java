class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int m = str1.length();
        int n = str2.length(); 
        int dp[][] = new int[m + 1][n + 1]; // DP table to store LCS lengths

        // Compute the length of LCS (Longest Common Subsequence)
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) { // If characters match
                    dp[i][j] = 1 + dp[i - 1][j - 1]; // Add 1 to previous diagonal value
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]); // Take max from left or top
                }
            }
        }

        // Build the shortest common supersequence
        StringBuilder sb = new StringBuilder(); // StringBuilder to store result
        int i = m, j = n;

        // Traverse the DP table backwards to construct the SCS
        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) { // If characters match, add to result
                sb.append(str1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) { // Move in direction of larger value
                sb.append(str1.charAt(i - 1)); // Include character from str1
                i--;
            } else {
                sb.append(str2.charAt(j - 1)); // Include character from str2
                j--;
            }
        }

        // Append remaining characters from str1, if any
        while (i > 0) {
            sb.append(str1.charAt(i - 1));
            i--;
        }

        // Append remaining characters from str2, if any
        while (j > 0) {
            sb.append(str2.charAt(j - 1));
            j--;
        }

        return sb.reverse().toString(); // Reverse and return the final result
    
    }
}