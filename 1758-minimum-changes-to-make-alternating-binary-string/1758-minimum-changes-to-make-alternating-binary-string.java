class Solution {
    public int minOperations(String s) {
        int count1 = 0, count2 = 0;

        for(int i = 0; i < s.length(); i++){
           char ch = s.charAt(i);

           if(ch != (i % 2 == 0 ? '1' : '0')) count1++;
           if(ch != (i % 2 == 0 ? '0' : '1')) count2++;
        }
        return Math.min(count1, count2);
    }
}