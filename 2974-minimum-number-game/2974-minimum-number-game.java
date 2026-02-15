class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = 1;
        while (right < nums.length) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left += 2;
            right += 2;
        }
        return nums;
    }
}