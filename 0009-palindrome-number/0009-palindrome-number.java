class Solution {
    public boolean isPalindrome(int n) {
        int m=n;
        int r;
        int reverse=0;
        while(n>0){
            r=n%10;
            n=n/10;
            reverse=reverse*10+r;
        }
        return m==reverse;
    }
}