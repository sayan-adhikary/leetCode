class Solution {
    public int maxProfit(int[] prices) {
        int maxi = 0, n = prices.length - 1, ans = 0;
        for (int i = n; i >= 0; i--) {
            maxi = Math.max(maxi, prices[i]);
            ans = Math.max(ans, maxi - prices[i]);
        }
        return ans;
    }
}