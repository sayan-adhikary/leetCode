class Solution {
    public int[] numberGame(int[] nums) {
        //[5,4,2,3] => [2,3,4,5] ==> [3,2,5,4]
        int[] arr = new int[nums.length];
        Arrays.sort(nums);
        int i = 0;
        while(i < nums.length - 1){
            arr[i] = nums[i+1];
            arr[i + 1] = nums[i];
            i +=2;
        }
        return arr;
    }
}