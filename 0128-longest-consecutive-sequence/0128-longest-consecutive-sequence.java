class Solution {
    public int longestConsecutive(int[] nums) {
         int n = nums.length;

        if (n == 0) return 0; 

        Arrays.sort(nums); // Sort the array

        int lastSmaller = Integer.MIN_VALUE; 
        int cnt = 0; 
        int longest = 1; 

        for (int i = 0; i < n; i++) {
            if (nums[i] - 1 == lastSmaller) {
                cnt += 1; 
                lastSmaller = nums[i]; 
            } 
            else if (nums[i] != lastSmaller) {
                cnt = 1; 
                lastSmaller = nums[i]; 
            }
            longest = Math.max(longest, cnt); 
        }
        return longest;
    }
}