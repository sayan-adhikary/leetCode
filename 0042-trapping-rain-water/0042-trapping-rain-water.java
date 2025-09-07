class Solution {
    public int trap(int[] height) {
        int n = height.length;
        //calculate left max boundary - array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        //calculate right max boundary - array
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        //loop
        int trappRainWater = 0;
        for (int i = 0; i < n; i++) {
            //waterlevel = min(leftmax boundary , rightmax boundary)
            int largestBulding = Math.min(leftmax[i], rightmax[i]);
            //trapped water = waterlevel - height[i]
            trappRainWater += largestBulding - height[i];
        }
        return trappRainWater;
    }
}