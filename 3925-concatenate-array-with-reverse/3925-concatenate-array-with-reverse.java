class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int low = 0, high = ans.length - 1;
        while(low < high){
            ans[low] = ans[high] = nums[low];
            low++;
            high--;
        }
        return ans;
    }
}