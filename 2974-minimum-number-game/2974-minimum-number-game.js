/**
 * @param {number[]} nums
 * @return {number[]}
 */
var numberGame = function(nums) {
    nums.sort((a, b) => a - b);
    
    // Step 2: Swap every pair
    for (let i = 0; i < nums.length; i += 2) {
        let temp = nums[i];
        nums[i] = nums[i + 1];
        nums[i + 1] = temp;
    }
    
    return nums;
};