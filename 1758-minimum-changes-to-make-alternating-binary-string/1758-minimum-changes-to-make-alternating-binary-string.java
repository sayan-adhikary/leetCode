class Solution {
    public int minOperations(String s) {

        int count = 0;
        int n = s.length();

        for(int i = 0; i < n; i++) {
            int num = s.charAt(i) - '0';

            if(num != i % 2) {
                count++;
            }
        }

        return Math.min(count, n - count);
    }
}