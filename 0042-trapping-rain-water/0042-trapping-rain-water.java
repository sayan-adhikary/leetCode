class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int[] leftmax = new int[n];
        int[] rightmax = new int[n];

        //calculate left max boundary - stack
        Stack<Integer> leftmaxSt = new Stack<>();
        leftmaxSt.push(height[0]);
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            if(height[i] > leftmaxSt.peek()){
                leftmaxSt.push(height[i]);
            }
            leftmax[i] = leftmaxSt.peek();
        }

        //calculate right max boundary - Stack
        Stack<Integer> rightmaxSt = new Stack<>();
        rightmaxSt.push(height[n - 1]);
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if(height[i] > rightmaxSt.peek()){
                rightmaxSt.push(height[i]);
            }
            rightmax[i] = rightmaxSt.peek();
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