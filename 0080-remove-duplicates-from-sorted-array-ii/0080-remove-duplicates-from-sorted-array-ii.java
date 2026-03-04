class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int k = 1;           
        int count = 1;       
        int currentEle = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == currentEle) {
                count++;
            } else {
                currentEle = nums[i];
                count = 1;
            }

            if (count <= 2) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}