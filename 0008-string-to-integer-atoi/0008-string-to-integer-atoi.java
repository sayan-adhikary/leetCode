class Solution {
    public int myAtoi(String s) {
        int index = 0, sign = 1, total = 0;
        int n = s.length();

        // Step 1: Remove leading whitespaces
        while (index < n && s.charAt(index) == ' ') {
            index++;
        }

        // Step 2: Handle signs
        if (index < n && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }

        // Step 3: Convert digits and avoid overflow
        while (index < n) {
            char c = s.charAt(index);
            if (c < '0' || c > '9') {
                break;
            }

            int digit = c - '0';

            // Check for overflow/underflow
            if (total > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            total = total * 10 + digit;
            index++;
        }

        return total * sign;
    }

}