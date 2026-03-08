class Solution {
    public int minFlips(String s) {
        int n = s.length();
        String extended = s + s;

        int mismatch1 = 0; // for pattern "010101..."
        int mismatch2 = 0; // for pattern "101010..."
        int left = 0;
        int result = Integer.MAX_VALUE;

        for (int right = 0; right < extended.length(); right++) {

            char expected1 = (right % 2 == 0) ? '0' : '1';
            char expected2 = (right % 2 == 0) ? '1' : '0';

            if (extended.charAt(right) != expected1) {
                mismatch1++;
            }

            if (extended.charAt(right) != expected2) {
                mismatch2++;
            }

            if (right - left + 1 > n) {

                char leftExpected1 = (left % 2 == 0) ? '0' : '1';
                char leftExpected2 = (left % 2 == 0) ? '1' : '0';

                if (extended.charAt(left) != leftExpected1) {
                    mismatch1--;
                }

                if (extended.charAt(left) != leftExpected2) {
                    mismatch2--;
                }

                left++;
            }

            if (right - left + 1 == n) {
                result = Math.min(result, Math.min(mismatch1, mismatch2));
            }
        }

        return result;
    }
}