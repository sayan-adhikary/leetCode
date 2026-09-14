/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function (nums) {
    let ans = new Array(nums.length).fill(0);
    let i = 0;
    nums.forEach((num) => {
        if (num != 0) {
            ans[i++] = num;
        }
    })
    for (let i = 0; i < ans.length; i++) {
        nums[i] = ans[i];
    }
};