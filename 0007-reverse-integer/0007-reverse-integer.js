/**
 * @param {number} x
 * @return {number}
 */
var reverse = function (x) {
    let reverse = 0, r = 0;
    let isNegative = false;

    if(x < 0){
        x = - x;
        isNegative = true;
    }
    while (x > 0) {
        reverse = reverse * 10 + (x % 10);
        x = Math.floor(x / 10);
    }
    if(isNegative){
        reverse = - reverse;
    }
    return (reverse >= -(2 ** 31) && reverse <= (2 ** 31 - 1)) ? reverse : 0;
};