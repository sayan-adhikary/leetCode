class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        // Set to store unique quadruplets
        Set<List<Integer>> set = new HashSet<>();

        // Checking all possible quadruplets
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Set to store elements seen so far in the loop
                Set<Long> hashset = new HashSet<>();

                for (int k = j + 1; k < n; k++) {
                    /* Calculate the fourth element
                    needed to reach target*/
                    long sum = (long) nums[i] + nums[j] + nums[k];
                    long fourth = target - sum;

                    /* Find if fourth element exists in 
                    hashset (complements seen so far)*/
                    if (hashset.contains(fourth)) {
                        // Found a quadruplet that sums up to target
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], (int) fourth);
                        Collections.sort(temp);
                        set.add(temp);
                    }

                    // Insert the kth element into hashset for future checks
                    hashset.add((long) nums[k]);
                }
            }
        }

        // Convert set to list (unique quadruplets)
        ans.addAll(set);
        return ans;
    }
}