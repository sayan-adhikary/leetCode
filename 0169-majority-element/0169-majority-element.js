/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function (nums) {
    let count = 0;
    let elem = nums[0];
    for (let i = 0; i < nums.length; i++) {
        if (elem === nums[i]){
            count++;
        } else if(count === 0){
            elem = nums[i];
        } else {
            count--;
        }
    }

    return elem;
};