/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function (nums) {
    let n=nums.length;

    let totalSum = n*(n+1)/2
    

    let elementSum = 0
    for (let i = 0; i < nums.length; i++) {
        elementSum += nums[i];
    }
    return totalSum - elementSum;
};

//[9,6,4,2,3,5,7,0,1] -> 9