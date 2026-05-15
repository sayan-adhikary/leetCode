class Solution {
    public int findPeakElement(int[] nums) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) {
                return i;
            }
        }
        return nums[0] > nums[nums.length - 1] ? 0 : nums.length - 1;
    }
}