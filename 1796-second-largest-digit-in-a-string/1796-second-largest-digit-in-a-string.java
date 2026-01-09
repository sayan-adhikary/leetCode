class Solution {
    public int secondHighest(String s) {

        boolean[] arr = new boolean[10];    //0-9 -> 10

        for(int i = 0; i < s.length(); i++){
            Character ch = s.charAt(i);
            if(Character.isDigit(ch)){
                arr[ch - '0'] = true;
            }
        }
        int count = 0;
        for(int i = 9; i >= 0; i--){
            if(arr[i]){
                count++;
                if(count == 2){     //second last
                    return i;
                }
            }
        }
        return -1;
    }
}