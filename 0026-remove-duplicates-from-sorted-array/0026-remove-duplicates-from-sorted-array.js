/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function (arr) {
    if(arr.length == 1){
        return 1;
    }
    let left = 0;
    let right = 1;
    let n = arr.length;
    while (right < n) {
        while (right < n && arr[left] == arr[right]) {
            right++;
        }
        arr[++left] = arr[right];
    }
    return left;
};