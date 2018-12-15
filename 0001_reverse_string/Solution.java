public class Solution {
    public String reverseString(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }

        return new String(arr);
    }

    public String reverseStringByStringBuilder(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.reverseString("hello")); // olleh
        System.out.println(s.reverseStringByStringBuilder("hello")); // olleh
    }
}
