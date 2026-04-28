class Solution {
    public int findUnsortedSubarray(int[] N) {
        int len = N.length - 1, left = -1, right = -1,
            max = N[0], min = N[len];
        for (int i = 1; i <= len; i++) {
            int a = N[i], b = N[len-i];
            if (a < max) right = i;
            else max = a;
            if (b > min) left = i;
            else min = b;
        }
        return Math.max(0, left + right - len + 1);
    }
}