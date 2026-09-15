/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findMaxAverage = function (nums, k) {
    let maxAvg = -Infinity;
    for (let i = 0; i < nums.length - k + 1; i++) {
        let sum = 0;
        for (let j = i; j < k + i; j++) {
            sum += nums[j];
        }
        maxAvg = Math.max(maxAvg, sum/k);
    }
    return maxAvg;
};