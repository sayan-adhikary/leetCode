class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int len = nums.length;
        if(len == 1)
        {
            return 1;
        }

        int incre = 0, count = 0;

        for(int i = 0; i < len - 1; i++)
        {
            count++;

            if(nums[i+1] <= nums[i])
            {
                incre = Math.max(incre, count);
                count = 0;
            }
        }

        if(nums[len-1] > nums[len-2])
        {
            count++;
            incre = Math.max(incre, count);
        }

        int decre = 0;
        count = 0;

        for(int i = 0; i < len - 1; i++)
        {
            count++;

            if(nums[i+1] >= nums[i])
            {
                decre = Math.max(decre, count);
                count = 0;
            }
        }

        if(nums[len-1] < nums[len-2])
        {
            count++;
            decre = Math.max(decre, count);
        }


        return Math.max(incre, decre);
    }
}