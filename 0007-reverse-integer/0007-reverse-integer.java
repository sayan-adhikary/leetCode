class Solution {
    public int reverse(int x) {
       int reverce = 0,r;
       boolean isNegative = x < 0;
       if(isNegative){
        x = - x;
       }
        while (x > 0) {
            r = x % 10;
            x = x / 10;
        if (reverce > Integer.MAX_VALUE / 10 || (reverce == Integer.MAX_VALUE / 10 && r > 7)) {
                return 0;
            }
             reverce = reverce * 10 + r;
        }
        if(isNegative){
            reverce = - reverce;
        }
        return reverce;   
    }
}