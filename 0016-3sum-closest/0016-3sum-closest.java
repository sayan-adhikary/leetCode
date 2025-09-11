class Solution {
    public int threeSumClosest(int[] nums, int target) {
         byte[] count = new byte[2001];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]+1000]++;
        }

        for(int k=0,i=0; k< count.length;k++){
            while (count[k] > 0){
                nums[i] = k - 1000;
                i++;
                count[k]--;
            }
        }

        int low = 0, high = nums.length-1;
        while (low+1 < high -1 &&nums[low+1]+nums[high]+nums[high-1]< target){
            low ++;
        }

        while ( high-1> low +1&& nums[low]+nums[low+1]+nums[high-1] > target){
            high --;
        }

        int closet = Integer.MAX_VALUE;
        int closestresult = 0;
        for(int i = low; i < high-1; i++) {

            int k = i+1;
            int j = high;
            while(k < j) {
                int total = nums[i] + nums[k] + nums[j];
                if (total > target) {
                    j--;
                    while (j>k&&nums[j]==nums[j+1]){
                        j--;
                    }
                } else if (total < target) {
                    k++;
                    while (k<j&&nums[k]==nums[k-1]){
                        k++;
                    }
                } else {
                    return target;
                }

                int minus = Math.abs(total - target);
                if (minus < closet) {
                    closet = minus;
                    closestresult = total;
                }

            }
            while (i+1 < high-1&&nums[i] == nums[i+1]) i++;
        }

        return closestresult;
    }
}