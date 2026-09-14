/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function (nums) {
    let i = 0;
    let j = 1;
    let n = nums.length;
    while (j < n) {
        if (nums[i] != 0) {
            i++;
            j++;
        } else {
            while (j < n && nums[j] != 0) {
                [nums[i], nums[j]] = [nums[j], nums[i]];
                i++;
                j++;
            }
            j++;
        }
    }
};