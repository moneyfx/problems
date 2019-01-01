// https://leetcode.com/problems/single-number
class Solution {
    public int singleNumber(int[] nums) {
        int r = 0;
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            r = r ^ nums[i];
        }

        return r;
    }
}
