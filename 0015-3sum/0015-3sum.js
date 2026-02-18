/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function (nums) {
    let arr = [];   //create a empty array

    nums.sort((a, b) => a - b);     //sort the array

    for (let i = 0; i < nums.length; i++) {   //itrate one by one
        if (nums[i] === nums[i - 1]) continue;   //if both are same element skip

        let left = i + 1;
        let right = nums.length - 1;

        while (left < right) {
            let sum = nums[i] + nums[left] + nums[right];

            if (sum > 0) {            //right--
                right--;

            } else if (sum < 0) {      //left++
                left++;

            } else {              //sum === 0
                let temp = [nums[i], nums[left], nums[right]];
                arr.push(temp);     //add triplet

                left++;
                right--;
                while (left < right && nums[left] === nums[left - 1]) left++;
                while (left < right && nums[right] === nums[right + 1]) right--;

            }
        }
    }
    return arr;
};