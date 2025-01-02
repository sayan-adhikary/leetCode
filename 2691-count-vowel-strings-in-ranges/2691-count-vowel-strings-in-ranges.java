class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] vowelStringCount = new int[words.length];
        int [] result = new int[queries.length];
        int cnt = 0;

        //Prefix vowel string count till each index
        for (int i = 0; i < words.length; i++) {
            if (isVowelString(words[i])) {
                cnt++;
            }
            vowelStringCount[i] = cnt;
        }

        for (int i = 0; i < queries.length; i++) {
            int j = queries[i][0], k = queries[i][1];
            // This means we just need count of vowel string
            if (j == 0) {
                result[i] = vowelStringCount[k];
            }
            // We need to subract count till index j from index k 
            else {
                result[i] = vowelStringCount[k] - vowelStringCount[j - 1];
            }
        }

        return result;
    }

    public boolean isVowelString(String s) {
        return isVowel(s.charAt(0)) && isVowel(s.charAt(s.length() - 1));
    }

    public boolean isVowel(Character ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }
}