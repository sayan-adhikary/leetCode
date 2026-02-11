/**
 * @param {number} num
 * @return {number}
 */
var addDigits = function(num) {
    let sum = 0;
    while(num > 9){
        while(num){
            sum += num %10;
            num = Math.floor(num /10);
        }
        num = sum;
        sum = 0;
    }
    return num;
};