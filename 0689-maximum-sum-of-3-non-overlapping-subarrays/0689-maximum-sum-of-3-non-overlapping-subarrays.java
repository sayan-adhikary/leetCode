class Solution {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int n = nums.length;
        
        // Precompute the left and right subarray maximum sums and their starting indices
        long[][] left = computeLeft(nums, k);
        long[][] right = computeRight(nums, k);
        
        int l = k; // Pointer for the middle subarray's start
        long currSum = 0; // Current sum of the middle subarray
        long res = 0; // Maximum sum across all valid configurations
        int[] r = new int[3]; // Result array to store the starting indices of the three subarrays
        
        // Iterate to find the middle subarray's starting point
        for (int i = k; i < n - k; i++) {
            currSum += nums[i]; // Add the current element to the middle subarray sum
            
            // Check if the middle subarray has reached size k
            if (i - l + 1 == k) {
                // Calculate the total sum of the left, middle, and right subarrays
                long curr = left[l - k][1] + currSum + right[i + 1][1];
                
                // Update the result if a larger sum is found
                if (curr > res) {
                    res = curr;
                    r[0] = (int) left[l - k][0]; // Starting index of the left subarray
                    r[1] = l; // Starting index of the middle subarray
                    r[2] = (int) right[i + 1][0]; // Starting index of the right subarray
                }
                
                // Remove the first element of the middle subarray to maintain its size
                currSum -= nums[l++];
            }
        }
        return r;
    }

    // Function to compute the left subarray maximum sums and their starting indices
    long[][] computeLeft(int[] nums, int k) {
        int n = nums.length;
        long[][] left = new long[n][2]; // Stores max sum and its starting index for each position
        int l = 0; // Pointer for the start of the current window
        long sum = 0; // Current sum of the window
        
        // Precompute the sum for the first k-1 elements
        for (int i = 0; i < k - 1; i++) sum += nums[i];
        
        // Iterate over the array to compute the left subarray sums
        for (int i = k - 1; i < n - 2 * k; i++) {
            sum += nums[i]; // Add the current element to the window sum
            
            // Update the max sum and starting index
            if (l == 0 || left[l - 1][1] < sum) {
                left[l][0] = l; // Starting index of the max sum subarray
                left[l][1] = sum; // Max sum
            } else {
                left[l][0] = left[l - 1][0];
                left[l][1] = left[l - 1][1];
            }
            
            // Remove the first element of the window to maintain size k
            sum -= nums[l++];
        }
        return left;
    }

    // Function to compute the right subarray maximum sums and their starting indices
    long[][] computeRight(int[] nums, int k) {
        int n = nums.length;
        long[][] right = new long[n][2]; // Stores max sum and its starting index for each position
        int r = n - k; // Pointer for the start of the current window
        long sum = 0; // Current sum of the window
        int last = n - 1; // Pointer to track the last element of the current window
        
        // Precompute the sum for the last k-1 elements
        for (int i = 0; i < k - 1; i++) sum += nums[n - 1 - i];
        
        // Iterate over the array to compute the right subarray sums
        for (int i = n - k; i >= 2 * k; i--) {
            sum += nums[i]; // Add the current element to the window sum
            
            // Update the max sum and starting index
            if (r == n - k || right[r + 1][1] <= sum) {
                right[r][0] = r; // Starting index of the max sum subarray
                right[r][1] = sum; // Max sum
            } else {
                right[r][0] = right[r + 1][0];
                right[r][1] = right[r + 1][1];
            }
            
            // Remove the last element of the window to maintain size k
            sum -= nums[last--];
            r--;
        }
        return right;
    }
}