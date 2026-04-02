/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let mp = new Map();
    for(let i = 0; i < nums.length; i++){
        let x = target - nums[i];
        if(mp.has(x)){
            return [mp.get(x), i];
        } else{
            mp.set(nums[i], i);
        }
    }
    return [];
};