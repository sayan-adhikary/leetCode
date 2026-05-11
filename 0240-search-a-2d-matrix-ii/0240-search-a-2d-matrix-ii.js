/**
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
var searchMatrix = function(arr, target) {
    let n = arr.length;
    let m = arr[0].length;
    let r = n-1;
    let c = 0;
    while(r>=0 && c<m){
        let curr = arr[r][c];
        if(curr == target){
            return true;
        }
        else if(curr < target){
            c++;
        }
        else{
            r--;
        }
    }
    return false;
};