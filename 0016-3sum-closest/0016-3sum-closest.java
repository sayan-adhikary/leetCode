class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        int prevDif= Integer.MAX_VALUE;
        int ans = 0;
        for(int i = 0;i< len;i++ ){
            int j = i+1;
            int k = len-1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(Math.abs(sum-target) < prevDif){
                    prevDif = Math.abs(sum-target);
                    ans = sum;
                }

                if(sum > target){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return ans;
    }
}