class Solution {
    public int countValidPrefixes(String s) {
        int zero = 0;
        int one = 0;
        int ans = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '0') {
                zero++;
            } else {
                one++;
            }

            if (Math.abs(zero - one) <= 1) {
                ans++;
            }
        }
        return ans;
    }
}