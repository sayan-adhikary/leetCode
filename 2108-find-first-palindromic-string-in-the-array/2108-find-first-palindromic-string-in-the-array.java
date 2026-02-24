class Solution {
    public String firstPalindrome(String[] words) {
        for(int i = 0; i < words.length; i++){
            if(checkPalindrom(words[i])){
                return words[i];
            }
        }
        return "";
    }

    private boolean checkPalindrom(String str){
        String reversedStr = new StringBuilder(str).reverse().toString();
        if(str.equals(reversedStr)){
            return true;
        }
        return false;
    }
}