class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        long sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        // long avg = (sum / k);
        long max = sum;
        int i = 0;
        int j = k;
        while (j < n) {
            sum = sum - nums[i] + nums[j];
            // avg = sum / k;
            max = Math.max(sum, max);
            i++;
            j++;
        }
        return (double) max / k;
    }
}