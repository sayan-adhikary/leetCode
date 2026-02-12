/**
 * @param {number} num
 * @return {number}
 */
var addDigits = function (num) {//Sayan
    if (num <= 9) {
        return num;
    } else if (num % 9 === 0) {
        return 9;
    } else {
        return num % 9;
    }
};