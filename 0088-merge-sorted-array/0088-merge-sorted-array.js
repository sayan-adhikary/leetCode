/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function (nums1, m, nums2, n) {
    let merged = new Array(m + n);
    let left = 0;
    let right = 0;
    let index = 0;

    while (left < m && right < n) {
        if (nums1[left] <= nums2[right]) {
            merged[index++] = nums1[left++];
        } else {
            merged[index++] = nums2[right++];
        }
    }

    while (left < m) {
        merged[index++] = nums1[left++];
    }

    while (right < n) {
        merged[index++] = nums2[right++];
    }

    for (let i = 0; i < m + n; i++) {
        nums1[i] = merged[i];
    }
};