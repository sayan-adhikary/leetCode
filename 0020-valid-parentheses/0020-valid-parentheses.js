/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function (s) {
    let st = [];
    for (let i = 0; i < s.length; i++) {
        if (s[i] == '(' || s[i] == '{' || s[i] == '[') {
            st.push(s[i]);
        } else {
            if (st.length > 0) {
                let ch = st[st.length - 1];
                // {
                ch += s[i];
                // ch = {}
                st.pop();
                if (ch == "()" || ch == "{}" || ch == "[]") {
                    continue;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }
    if (st.length > 0) {
        return false;
    }
    return true;
};