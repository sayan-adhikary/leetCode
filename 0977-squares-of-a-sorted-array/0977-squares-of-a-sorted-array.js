/**
 * @param {number[]} nums
 * @return {number[]}
 */
var sortedSquares = function (nums) {
    let left = 0;
    let right = nums.length - 1;
    let index = nums.length - 1;
    let ans = new Array(nums.length);

    while (left <= right) {
        if (Math.abs(nums[left]) < Math.abs(nums[right])) {
            ans[index--] = nums[right] ** 2;
            right--;
        } else {
            ans[index--] = nums[left] ** 2;
            left++;
        }
    }
    return ans;
};