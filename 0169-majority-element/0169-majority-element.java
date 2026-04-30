class Solution {
    public int majorityElement(int[] nums) {
        int element = 0, count = 0;
        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                count++;
                element = nums[i];
            } else if(element == nums[i]){
                count++;
            } else{
                count--;
            }
        }

        int newCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(element == nums[i]){
                newCount++;
            }
        }
        if(newCount > nums.length/2){
            return element;
        }
        return -1;
    }
}