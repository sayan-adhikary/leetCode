/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function (s) {
    let arr = s.trim().split(" ").reverse();
    let newArr = []
    for (let ele of arr) {
        if (ele != '') {
            newArr.push(ele);
        }
    }
    return newArr.join(" ");
};