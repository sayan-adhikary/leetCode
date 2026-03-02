class Solution {
    public int majorityElement(int[] nums) {
        int elm = 0, count = 0;
        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                elm = nums[i];
                count++;
            } else if(elm == nums[i]){
                count++;
            } else{
                count--;
            }
        }
        int count1 = 0;
        for(int i = 0; i < nums.length; i++){
            if(elm == nums[i]){
                count1++;
            }
        }
        if(count1>(nums.length/2)){
            return elm;
        }
        return -1;
    }
}