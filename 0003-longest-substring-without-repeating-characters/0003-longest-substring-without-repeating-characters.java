class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256];
        Arrays.fill(hash, -1);
        int left = 0, right = 0;
        int maxLength = 0, length = 0;
        int n = s.length();
        while (right < n) {
            if (hash[s.charAt(right)] != -1) {
                left = Math.max(left, hash[s.charAt(right)] + 1);
            }
            hash[s.charAt(right)] = right;
            length = right - left + 1;
            maxLength = Math.max(maxLength, length);
            right++;
        }
        return maxLength;
    }
}