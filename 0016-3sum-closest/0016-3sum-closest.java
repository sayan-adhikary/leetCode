class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // Count sort optimization for -1000 to 1000
        byte[] count = new byte[2001];
        for (int num : nums) {
            count[num + 1000]++;
        }

        // Reconstruct sorted array
        int idx = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                nums[idx++] = i - 1000;
            }
        }

        int closest = nums[0] + nums[1] + nums[2];
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            int a = nums[i];
            int left = i + 1, right = n - 1;

            while (left < right) {
                int b = nums[left];
                int c = nums[right];
                int sum = a + b + c;

                if (sum == target) return sum;

                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }

                if (sum < target) {
                    left++;
                    while (left < right && nums[left] == nums[left - 1]) left++; // skip duplicates
                } else {
                    right--;
                    while (right > left && nums[right] == nums[right + 1]) right--; // skip duplicates
                }
            }

            while (i + 1 < n && nums[i] == nums[i + 1]) i++; // skip duplicates
        }

        return closest;
    }
}
