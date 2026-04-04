/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if(x < 0) return false;
    let str = x.toString().split("").reverse().join("");
    console.log(str);
    return (x == str);
};