/**
 * @param {string} s
 * @param {number} k
 * @return {number}
 */
var maxVowels = function (s, k) {
    let st = new Set(['a', 'e', 'i', 'o', 'u']);
    let count = 0;
    for (let i = 0; i < k; i++) {
        if (st.has(s[i])) {
            count++;
        }
    }

    let ans = count;
    for (let i = k; i < s.length; i++) {

        if (st.has(s[i])) {
            count++;
        }

        if (st.has(s[i - k])) {
            count--;
        }

        ans = Math.max(count, ans);
    }
    return ans;
};