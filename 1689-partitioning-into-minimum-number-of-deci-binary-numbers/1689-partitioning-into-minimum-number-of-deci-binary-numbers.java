class Solution {
    public int minPartitions(String n) {
        for (char ch = '9'; ch >= '0'; ch--) {
            if (n.indexOf(ch) != -1) {
                return ch - '0';
            }
        }
        return -1;
    }
}