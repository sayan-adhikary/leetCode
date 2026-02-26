/**
 * @param {string[]} words
 * @return {string}
 */
var firstPalindrome = function (words) {
    for (let i = 0; i < words.length; i++) {
        if (reverseString(words[i])) {
            return words[i];
        }
    }
    return "";
};

function reverseString(str) {
    reversedStr = str.split("").reverse().join("");
    if (str === reversedStr) {
        return true;
    }
    return false;
}
