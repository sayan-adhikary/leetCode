class Solution {
    public int findKthPositive(int[] arr, int k) {
        int prev = 0;

        for (int num : arr) {
            
            int missing = num - prev - 1;

            if (k <= missing) {
                return prev + k;
            }
            k -= missing;
            prev = num;
        }
        return prev + k;
    }
}