/**
 * @param {number[]} nums
 * @return {number[]}
 */
var sortedSquares = function(nums) {
    let left = 0;
    let right = nums.length - 1;
    let ans = [];

    while(left <= right){
        if(nums[left]**2 < nums[right]**2){
            ans.push(nums[right]**2);
            right--;
        } else {
            ans.push(nums[left]**2);
            left++;
        }
    }
    return ans.reverse();
};