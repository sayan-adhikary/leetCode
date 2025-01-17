class Solution {
    public String removeDigit(String number, char digit) {
        // To store the maximum result after removing one occurrence of digit
        String maxResult = "0";
        
        // Iterate through each character in the number string
        for (int i = 0; i < number.length(); i++) {
            // If we find the digit we want to remove
            if (number.charAt(i) == digit) {
                // Create new string by removing current digit
                // substring(0, i) gets characters before index i
                // substring(i + 1) gets characters after index i
                String newNum = number.substring(0, i) + number.substring(i + 1);
                
                // Compare the new number with our current maximum
                // We can use String comparison since all numbers are positive
                // and of same length except one digit
                if (newNum.compareTo(maxResult) > 0) {
                    maxResult = newNum;
                }
            }
        }
        
        return maxResult;
    }
}