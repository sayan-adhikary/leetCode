class Solution {

    private int checkDivisible(int[] arr, int divisor) {
        int sum = 0, count = 1;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.ceil((float) arr[i] / divisor);
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = Arrays.stream(nums).max().orElse(-1);
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (checkDivisible(nums, mid) <= threshold) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}