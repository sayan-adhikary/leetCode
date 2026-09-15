/**
 * @param {number[]} g
 * @param {number[]} s
 * @return {number}
 */
var findContentChildren = function (g, s) {
    g.sort((a, b) => a - b)
    s.sort((a, b) => a - b)
    let i = 0;  //g
    let j = 0;  //s
    let count = 0;

    while (i < g.length && j < s.length) {
        if (s[j] >= g[i]) {
            i++;
            j++;
            count++;
        } else {
            j++;
        }
    }
    return count;
};

// [10,9,8,7] => [7,8,9,10] g
// [5,6,7,8] = > [5,6,7,8] s