class Solution {
    /*
     * Approach :- (Optimized) [Dutch National flag algo]
     * 1. one's position should check until it will not run out the two's poisition;
     * 2. check if one's elem is 0 then swap with zero'th elem and zero++ & one++;
     * 3. else if one's elem is 1 then just one++;
     * 4. else if one's elem is 2 then swap with two's elem only two--;
     */
    public void sortColors(int[] nums) {
        
        //[0 0 0 0 | 1 1 1 1 | 2 2 2 2] => [low | mid | high] 
        
        int zero = 0, one = 0, two = nums.length - 1;
        while (one <= two) {
            if (nums[one] == 0) {
                int temp = nums[zero];
                nums[zero] = nums[one];
                nums[one] = temp;
                zero++;
                one++;
            } else if (nums[one] == 1) {
                one++;
            } else {
                int temp = nums[two];
                nums[two] = nums[one];
                nums[one] = temp;
                two--;
            }
        }
    }
}