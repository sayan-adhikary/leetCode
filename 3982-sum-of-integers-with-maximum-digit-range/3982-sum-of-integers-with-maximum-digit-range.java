class Solution {
    public int maxDigitRange(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        int maxRange = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            while (n > 0) {
                int digit = n % 10;
                n /= 10;
                max = Math.max(max, digit);
                min = Math.min(min, digit);
            }
            int range = max - min;
            maxRange = Math.max(maxRange, range);
            mp.put(i, range);
        }
        int totalSum = 0;
        for (Integer key : mp.keySet()) {
            if (mp.get(key) == maxRange) {
                totalSum += nums[key];
            }
        }
        return totalSum;
    }
}