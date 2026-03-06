class Solution {
    public boolean checkOnesSegment(String s) {
        int point = 0;
        if(s.indexOf('0') == -1){
            return true;
        } else{
            point = s.indexOf('0');
        }
        for(int i = point; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                return false;
            }
        }
        return true;
    }
}