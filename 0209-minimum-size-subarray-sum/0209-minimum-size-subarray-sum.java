class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int right = 0, left = 0;
        int minLength = Integer.MAX_VALUE;
        int sum = nums[0];
        while(right < nums.length){
            while(left <= right && sum >= target){
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            } 
            
            right++;
            if(right < nums.length){
                sum += nums[right];
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}