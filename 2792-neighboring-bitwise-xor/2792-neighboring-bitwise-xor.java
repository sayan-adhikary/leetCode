class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int xor = 0, n = derived.length;
        for(int i = 0; i < n; i++)
            xor ^= derived[i]; 
         
        if(xor == 0) return true;
        return false;
    }
}