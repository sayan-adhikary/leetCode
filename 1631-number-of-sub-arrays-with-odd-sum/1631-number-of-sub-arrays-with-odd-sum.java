class Solution {
    final int MOD = 1000000007;
    public int numOfSubarrays(int[] arr) {
        int n = arr.length;
        int ans = 0;

        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];

        for(int i = 1; i < n; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        int evenCount = 0;
        int oddCount = 0;

        for(int i = n-1; i >= 0; i--){
            if((prefixSum[i] & 1 ) == 1){
                ans = (ans + 1) % MOD;
                ans = (ans + evenCount) % MOD;
                oddCount++;
            }
            else{
                ans = (ans + oddCount) % MOD;
                evenCount++;
            }
        }
        return ans;
    }
}