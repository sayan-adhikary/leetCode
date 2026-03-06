class Solution {
    public int minOperations(String s) {
        int count = 0;

        for(int i = 0; i < s.length(); i++){
           char ch = s.charAt(i);

           if(ch != (i % 2 == 0 ? '1' : '0')) count++;
        }
        return Math.min(count, s.length() - count);
    }
}