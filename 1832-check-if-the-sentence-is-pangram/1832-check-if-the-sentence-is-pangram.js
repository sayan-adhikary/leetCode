/**
 * @param {string} sentence
 * @return {boolean}
 */
var checkIfPangram = function(sentence) {
    return new Set(sentence.toLowerCase()).size === 26;
};