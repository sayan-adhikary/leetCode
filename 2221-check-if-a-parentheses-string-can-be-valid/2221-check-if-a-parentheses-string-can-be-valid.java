class Solution {
    public boolean canBeValid(String s, String locked) {
        int n=s.length();
        if(n%2!=0) return false;
        
        char ch[] = s.toCharArray();
        char l[] = locked.toCharArray();
        if(ch[0]==')' && l[0]=='1') return false;
        else if(ch[n-1]=='(' && l[n-1]=='1') return false;
        
        int open=0,close=0,ct=0;
        for(int i=0; i<n; i++){
            if(l[i] == '1'){
                if(ch[i]=='(') open++;
                else close++;
                if(open+ct < close) return false;
            }else{
                ct++;
            }
            
        }
        
        open=0;close=0;ct=0;
        for(int i=n-1; i>=0; i--){
            if(l[i] == '1'){
                if(ch[i]=='(') open++;
                else close++;
                if(open > close+ct) return false;
            }else{
                ct++;
            }
            
        }
        return true;
    }
}