/**
 * @param {number[]} nums
 * @return {number[]}
 */
var sortedSquares = function (nums) {
    let left = 0;
    let right = nums.length - 1;
    let last = nums.length - 1;
    let ans = new Array(nums.length);

    while (left <= right) {
        if (nums[left] ** 2 < nums[right] ** 2) {
            ans[last--] = nums[right] ** 2;
            right--;
        } else {
            ans[last--] = nums[left] ** 2;
            left++;
        }
    }
    return ans;
};