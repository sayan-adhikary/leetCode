/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    let newArr = '';
    for(let i = 0; i< s.length; i++){
        if((s[i] >= 'A' && s[i] <= 'Z') || (s[i] >= 'a' && s[i] <= 'z') || (s[i] >= '0' && s[i] <= '9')){
            newArr += s[i];
        }
    }
    let abc = newArr.toLowerCase();
    // if(abc.length == 1) return false;
    console.log(newArr.toLowerCase())
    let left = 0;
    let right = newArr.length - 1;
    while(left < right){
        if(abc[left] !== abc[right]){
            return false;
        }
        left++;
        right--;
    }
    return true;
};