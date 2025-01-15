class Solution {
    public int minimizeXor(int num1, int num2) {
        int count = Integer.bitCount(num2); 
        int res = 0;

        // Cancel set bits from highest to lowest weight
        for (int i = 31; i >= 0 && count > 0; i--) {
            if ((num1 & (1 << i)) != 0) {
                count--;
                res += (1 << i);
            }
        }

        // Set bits lowest to highest weight
        for (int i = 0; i < 32 && count > 0; i++) {
            if ((num1 & (1 << i)) == 0) {
                count--;
                res += (1 << i);
            }
        }
        return res;
    }
}