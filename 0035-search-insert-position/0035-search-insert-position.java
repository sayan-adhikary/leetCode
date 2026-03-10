class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int result = 0;
        while(start <= end){
            int mid = (start + end)/2;
            if(target < nums[0]){
                return 0;
            }
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] < target){
                start = mid + 1;
                result = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }
}