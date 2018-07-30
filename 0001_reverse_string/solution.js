//https://leetcode.com/problems/reverse-string/description/
const reverseString = function (str) {
    return str.split('').reverse().join('');
};

console.log(reverseString('hello')); // olleh
