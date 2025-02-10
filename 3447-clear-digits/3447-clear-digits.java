class Solution {
    public String clearDigits(String s) {
        StringBuilder sb= new StringBuilder(s);
        
        for(int i=0; i<sb.length(); i++){
            int chrIdx=sb.charAt(i)-'0';
            if(chrIdx>=0 && chrIdx<=9){ // Check if the character is a digit
                sb=sb.delete(i-1, i+1); // Delete the digit and its preceding character
                i-=2; // Adjust index to account for deletion
            }
        }

        return sb.toString(); // Return the modified string
    }
}