class Solution {
    /*
    Approach :- (Optimize)[Kadane's Algo]
    1. find the sum and max in one single loop
        1.1. if at any point sum become negative reset zero
    */
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        // 1. find the sum and max in one single loop
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(sum, max);

            // 1.1. if at any point sum become negative reset zero
            if (sum < 0)
                sum = 0;
        }
        return max;
    }
}