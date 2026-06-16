class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int m = g.length;
        int n = s.length;
        //1. Sort the array
        Arrays.sort(g);
        Arrays.sort(s);
        
        //2. Two pointer
        int i = 0, j = 0;
        while(i < m && j < n){
            if(s[j] >= g[i]){
                i++;
            }
            j++;
        }
        return i;
    }
}