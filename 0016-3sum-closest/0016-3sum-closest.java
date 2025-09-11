class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // Count sort to optimize sorting time for constrained input range
        byte[] count = new byte[2001];  // range [-1000, 1000]
        for (int num : nums) {
            count[num + 1000]++;
        }

        // Rebuild sorted nums array
        int[] sorted = new int[nums.length];
        int idx = 0;
        for (int i = 0; i < 2001; i++) {
            while (count[i]-- > 0) {
                sorted[idx++] = i - 1000;
            }
        }

        nums = sorted;
        int n = nums.length;
        int closest = nums[0] + nums[1] + nums[2]; // Initialize with first triplet

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicates

            int left = i + 1, right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                // Exact match shortcut
                if (sum == target) return sum;

                // Update closest if needed
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }

                // Move pointers
                if (sum < target) {
                    left++;
                    while (left < right && nums[left] == nums[left - 1]) left++; // skip duplicates
                } else {
                    right--;
                    while (left < right && nums[right] == nums[right + 1]) right--; // skip duplicates
                }
            }
        }

        return closest;
    }
}
