class Solution {
    public void helper(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {

        int n = nums.length; //[1,2,3,4,5,6,7] -> 7, k = 4; k = 5;
        //k = 8%7 = 1
        k = k % n;
        helper(nums, 0, n - 1); //[1,2] => [2,1], [1,2,3,4] = k = 2 => [4,3,1,2], 
        helper(nums, 0, k - 1); //[1,4,7,8,9]= k = 3 =>[9,8,7,4,1] [0,3-1] => [7,8,9,1,4]
        helper(nums, k, n - 1); //ans - [7,8,9,1,4]

        // =[1,4,7,8,9] k=6 n=5   => k = 7%5 = 2  
        //1.[91478]  2.89147 3.78914 4.47891  5.14789 6.91478    7.89147      
        // =[9,8,7,4,1] (0, n - 1)
        // =[7,8,9,4,1]  (0, k - 1)
        // =[7,8,9,1,4]   (k, n - 1)
    }
}