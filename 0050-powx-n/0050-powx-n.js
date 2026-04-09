/**
 * @param {number} x
 * @param {number} n
 * @return {number}
 */

function helper(x,n){
    if(n==0){
        return 1;
    }
    let temp = helper(x,Math.floor(n/2));
    if(n&1){
        return temp*temp*x;
    }
    return temp*temp;
}

var myPow = function(x, n) {
    let ans = helper(x,Math.abs(n));

    if(n<0){
        return 1/ans;
    }
    return ans;
};