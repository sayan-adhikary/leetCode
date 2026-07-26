class Solution {
    public int largestInteger(int n, int s) {
        if (s == 0)
            return 0;
        int newDigit = 0;
        StringBuilder str = new StringBuilder();
        if (s > 9 * n)
            return -1;
        while (n > 0) {
            newDigit = Math.min(9, s);
            str.append(newDigit);
            s -= newDigit;
            n--;
        }
        return Integer.parseInt(str.toString());
    }
}