class Solution {
    public String firstPalindrome(String[] words) {
        for(int k=0;k<words.length;k++){
            int i=0,j=words[k].length()-1;
            if(words[k].length()==1){
                return words[k];
            }
            while(i<j){
                if(words[k].charAt(i)!=words[k].charAt(j)){
                    break;
                }
                else{
                    i++;
                    j--;
                    if(i==j || j<i){
                        return words[k];
                    }
                }
            }
        }
        return "";
        
    }
}