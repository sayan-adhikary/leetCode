class Solution{
    // Function to find triplets having sum equals to 0
    public List<List<Integer>> threeSum(int[] nums) {
        // Set to store unique triplets
        Set<List<Integer>> tripletSet = new HashSet<>();

        int n = nums.length;

        // Check all possible triplets
        for (int i = 0; i < n; i++) {
            // Set to store elements seen so far in the loop
            Set<Integer> hashset = new HashSet<>();

            for (int j = i + 1; j < n; j++) {
                // Calculate the 3rd element needed to reach 0
                int third =  - (nums[i] + nums[j]);

                /* Find if third element exists in
                hashset (complements seen so far)*/
                if (hashset.contains(third)) {
                    // Found a triplet that sums up to target
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(third);

                    /* Sort the triplet to ensure
                    uniqueness when storing in set*/
                    Collections.sort(temp);
                    tripletSet.add(temp);
                }

                /* Insert the current element 
                into hashset for future checks*/
                hashset.add(nums[j]);
            }
        }

        // Convert set to list of lists (unique triplets)
        List<List<Integer>> ans = new ArrayList<>(tripletSet);

        //Return the ans
        return ans;
    }
}