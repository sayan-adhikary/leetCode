/**
 * @param {number[]} nums
 * @return {number[]}
 */
var sortedSquares = function (nums) {
    const newArray = new Array(nums.length);
    let left = 0;
    let right = nums.length - 1;
    let index = nums.length - 1;

    while (left <= right) {
        if (Math.abs(nums[left]) <= Math.abs(nums[right])) {
            newArray[index--] = nums[right] ** 2;
            right--;
        } else {
             newArray[index--] = nums[left] ** 2;
            left++;
        }
    }
    return newArray;
};      