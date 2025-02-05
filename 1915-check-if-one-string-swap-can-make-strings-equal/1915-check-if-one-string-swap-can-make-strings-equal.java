class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }
       char[] s3=s1.toCharArray();
       char[] s4=s2.toCharArray();
       Arrays.sort(s3);
       Arrays.sort(s4);
        if (!Arrays.equals(s3, s4)) {
            return false;
        }
       int diff=0;
       for(int i=0;i<s1.length();i++){
        if(s1.charAt(i) !=s2.charAt(i)) diff++;
       }
       return diff<3;
    }
}