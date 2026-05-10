class Solution {

    private int checkDay(int[] nums, int capacity){
        int sum = 0, totalDay = 1;
        for(int i = 0; i < nums.length; i++){
            if(sum + nums[i] > capacity){
                totalDay++;
                sum = 0;
            }
            sum += nums[i];
        }
        return totalDay;
    }
    
    public int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().orElse(-1);
        int high = Arrays.stream(weights).sum();
        int ans = 0;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(checkDay(weights, mid) <= days){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}