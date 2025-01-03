class Solution {
    public int waysToSplitArray(int[] nums) {
        long totalSum = 0;
        for(int i = 0; i < nums.length; i++){
            totalSum += nums[i];
        }
        long currentSum = 0;
        int validSplit = 0;
        for(int i = 0; i < nums.length - 1; i++){
            currentSum += nums[i];
            totalSum -= nums[i];
            if(currentSum >= totalSum){
                validSplit++;
            }
        }
        return validSplit;
    }
}