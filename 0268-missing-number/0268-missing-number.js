/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    let n = nums.length;
    let sumOfN = n * (n + 1) / 2;
    let current = 0;
    for(let i = 0; i < n; i++){
        current += nums[i];
    }
    return sumOfN - current;
};