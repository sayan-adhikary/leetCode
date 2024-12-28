class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1)
            return s;
        StringBuilder str = new StringBuilder("");
        int i = 0;
        int currDiff = (numRows-i-1)*2;
        boolean flag = false;
        while(i < numRows){
            int j = i;
            while(j < s.length()){
                if(i == 0 || i == numRows-1){
                    str.append(s.charAt(j));
                    j += currDiff;
                }
                else{
                    str.append(s.charAt(j));
                    j += currDiff;
                    currDiff = flag ? (numRows-i-1)*2 : i*2;
                    flag = !flag;
                }
            }
            i++;
            currDiff = (i == 0 || i == numRows-1) ? (numRows-1)*2 : (numRows-i-1)*2;
            flag = false;
        }
        return str.toString();
    }
}