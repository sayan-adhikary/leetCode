class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int start = 0, end = nums.length - 1;
        int index = nums.length - 1;

        while (start <= end) {
            if (Math.abs(nums[start]) > Math.abs(nums[end])) {
                arr[index--] = nums[start] * nums[start];
                start++;
            } else {
                arr[index--] = nums[end] * nums[end];
                end--;
            }
        }
        return arr;
    }
}