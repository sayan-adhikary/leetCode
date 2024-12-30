class Solution {
    public int maxArea(int[] arr) {
        int l = 0; 
        int r = arr.length - 1;
        int max = Integer.MIN_VALUE;

        while(l < r) {
            int length = r - l;
            int height = Math.min(arr[l], arr[r]);

            int area = length * height;

            max = Math.max(area,max);

            if(height == arr[l]){
                l++;
            }else{
                r--;
            }
        }
       return max; 
    }
}