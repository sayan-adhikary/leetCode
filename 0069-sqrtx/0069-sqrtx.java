class Solution {

    private long sqt(long a) {
        return a * a;
    }

    public int mySqrt(int x) {
        int low = 0, high = x, ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long square = sqt(mid);
            if (square <= x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}