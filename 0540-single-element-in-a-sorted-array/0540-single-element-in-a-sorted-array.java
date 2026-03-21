class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;

            // Ensure mid is even
                if (mid % 2 == 1) {
                mid--;
            }

            if (nums[mid] == nums[mid + 1]) {
                start = mid + 2;   // move right
            } else {
                end = mid;         // move left (including mid)
            }
        }

        return nums[start];
    }
}