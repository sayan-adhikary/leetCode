class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int currentSum = 0;
        int minimalLength = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            currentSum += nums[i];
            while(currentSum >= target){
                minimalLength = Math.min(minimalLength, i - left + 1);
                currentSum -= nums[left];
                left++;
            }
        }
        return minimalLength == Integer.MAX_VALUE ? 0 : minimalLength;
    }
}