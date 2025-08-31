class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int i = 0, j = length - 1;

        int ind[] = new int[2];
        ind[0] = 2;
        ind[1] = 2;
        while (i < length - 1) {

            if (nums[i] + nums[j] == target) {
                ind[0] = i;
                ind[1] = j;
                return ind;
            } else
                --j;
            if (j == i) {
                j = length - 1;
                ++i;
            }
        }
        return ind;
    }
}