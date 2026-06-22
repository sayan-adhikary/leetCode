class Solution {
    private void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivotIdx = -1;
        // 1. find the pivot idx[just drop from right] break;
        for(int i = n - 1; i > 0; i--){
            if(nums[i] > nums[i - 1]){
                pivotIdx = i - 1;
                break;
            }
        }
        System.out.println(pivotIdx);

        // 2. if idx = -1 {reverse entire array}
        if(pivotIdx == -1){
            reverse(nums, 0, n - 1);
            return;
        }

        // 3. if pivotIdx != -1 [find just greater from right] break;
        for(int i = n - 1; i > pivotIdx; i--){
            if(nums[pivotIdx] < nums[i]){
                int temp = nums[pivotIdx];
                nums[pivotIdx] = nums[i];
                nums[i] = temp;
                break;
            }
        }

        // 4. then reverse (idx + 1) to (n - 1);
        reverse(nums, pivotIdx + 1, n - 1);
    }
}