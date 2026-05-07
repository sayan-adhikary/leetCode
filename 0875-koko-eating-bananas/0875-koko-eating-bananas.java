class Solution {

    private int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        return max;
    }

    private int totalH(int[] arr, int elem) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += Math.ceil((double) arr[i] / elem);
        }
        return total;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = findMax(piles);
        int totalHours = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            totalHours = totalH(piles, mid);
            if (totalHours <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}