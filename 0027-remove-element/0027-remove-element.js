/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function (nums, val) {
    let ans = [];
    nums.forEach((num) => {
        if (num != val) {
            ans.push(num);
        }
    })
    for (let i = 0; i < ans.length; i++) {
        nums[i] = ans[i];
    }
    return ans.length;
};