class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>(); // List to store all subsets
        List<Integer> current = new ArrayList<>(); // Temporary list to store the current subset
        backtrack(0, nums.length, nums, current, ans); // Start the recursive process
        return ans;
    }

    private void backtrack(int index, int n, int[] nums, List<Integer> temp, List<List<Integer>> ans) {
        if (index == n) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        backtrack(index + 1, n, nums, temp, ans); //
        temp.add(nums[index]);
        backtrack(index + 1, n, nums, temp, ans);
        temp.remove(temp.size() - 1);
    }
}