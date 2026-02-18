/**
 * @param {string[]} sentences
 * @return {number}
 */
var mostWordsFound = function(sentences) {
    let max_word = 0;
    for(let i = 0; i < sentences.length; i++){
        max_word = Math.max(max_word, sentences[i].split(" ").length);
    }
    return max_word;
};