/**
 * @param {number[]} arr
 * @param {number} k
 * @param {number} threshold
 * @return {number}
 */
var numOfSubarrays = function (arr, k, threshold) {
    let target = k * threshold;
    let n = arr.length;

    let sum = 0;
    for (let i = 0; i < k; i++) {
        sum += arr[i];
    }
    let ans = 0;
    if (sum >= target) {
        ans++;
    }

    for (let i = k; i < n; i++) {
        sum += arr[i];

        sum -= arr[i - k];

        if (sum >= target) {
            ans++;
        }
    }

    return ans;
};