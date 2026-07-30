class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        int right = cardPoints.length - 1;
        for (int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }
        int max = sum;
        for (int i = k - 1; i >= 0; i--) {
            sum = sum - cardPoints[i] + cardPoints[right];
            max = Math.max(sum, max);
            right--;
        }
        return max;
    }
}