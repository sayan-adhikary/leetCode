class Solution {
    // Function to find triplets having sum equals to target
    public List<List<Integer>> threeSum(int[] nums) {
        
        // List to store the triplets that sum up to target
        List<List<Integer>> ans = new ArrayList<>();
        
        int n = nums.length;
        
        // Sort the input array nums
        Arrays.sort(nums);
        
        // Iterate through the array to find triplets
        for (int i = 0; i < n; i++) {
            // Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            // Two pointers approach
            int j = i + 1;
            int k = n - 1;
            
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    // Found a triplet that sums up to target
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    ans.add(temp);
                    
                    // Skip duplicates
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }
        
        return ans;
    }
}