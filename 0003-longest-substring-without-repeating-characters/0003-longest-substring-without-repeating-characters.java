class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int hash[] = new int[256];
            int length = 0;
            for (int j = i; j < s.length(); j++) {
                if (hash[s.charAt(j)] == 1)
                    break;
                hash[s.charAt(j)] = 1;
                length = j - i + 1;
                max = Math.max(max, length);
            }
        }
        return max;
    }
}