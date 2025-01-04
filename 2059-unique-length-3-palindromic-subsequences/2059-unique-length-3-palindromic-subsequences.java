class Solution {
    public int countPalindromicSubsequence(String s) {
        int ans = 0;
        int n = s.length()-1;
        char ch = 'a';
        int it = 0;
        while(it < 26){
           int i = 0;
           int j = n;
           while(i < n && s.charAt(i) != ch){
            i++;
           }
           while(j >= 0 && s.charAt(j) != ch){
            j--;
           }
           if(i < j){
            boolean count[] = new boolean[26];
            for(int k = i+1; k < j; k++){
                if(count[s.charAt(k)-'a'] != true){
                    ans++;
                    count[s.charAt(k)-'a'] = true;
                }
            }
           }
           it++;
           ch = (char)(ch + 1);
        }
        return ans;
    }
}