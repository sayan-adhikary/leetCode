class Solution {
    public int removeElement(int[] nums, int val) {

        int start = 0, end = nums.length - 1, count = 0;
        while (start <= end && end >= start) {
            if (nums[start] == val) {
                if (nums[start] == nums[end]) {
                    end--;
                } else {
                    int temp = nums[start];
                    nums[start++] = nums[end];
                    nums[end--] = temp;
                    count++;
                }
            } else {
                start++;
                count++;
            }
        }
        return count;
    }
}