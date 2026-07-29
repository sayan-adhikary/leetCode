class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double avg = (sum / k);
        double max = avg;
        int i = 0;
        int j = k;
        while (j < n) {
            sum = sum - nums[i] + nums[j];
            avg = sum / k;
            max = Math.max(avg, max);
            i++;
            j++;
        }
        return max;
    }
}