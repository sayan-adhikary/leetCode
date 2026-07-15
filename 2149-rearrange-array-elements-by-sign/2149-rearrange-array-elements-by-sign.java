class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length / 2;
        int[] pos = new int[n];
        int[] neg = new int[n];
        int a = 0, b = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                pos[a++] = nums[i];
            } else {
                neg[b++] = nums[i];
            }
        }

        a = b = 0;
        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                nums[i] = pos[a++];
            } else {
                nums[i] = neg[b++];
            }
        }
        return nums;
    }
}