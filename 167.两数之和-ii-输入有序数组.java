/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        if(len <= 1) {
            return null;
        }
        int l = 0;
        int r = len - 1;
        while(l < r) {
            int sum = numbers[l] + numbers[r];
            if(sum == target) {
                return new int [] {l+1, r+1};
            } else if (sum < target) {
                l ++;
            } else {
                r --;
            }
        }
        return null;
    }
}
// @lc code=end

