/*
 * @lc app=leetcode.cn id=300 lang=java
 *
 * [300] 最长上升子序列
 */

// @lc code=start
class Solution {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int [] top = new int [len];
        if(len == 0) return 0;
        int piles = 0;
        int mid = 0;
        for(int target : nums) {
            int left = 0;
            int right = piles;
            while(left < right) {
                mid = left + (right - left) / 2;
                if(target <= top[mid]) right = mid;
                else left = mid + 1; 
            }
            if(left == piles) piles ++;
            top[left] = target;
        }
        return piles;
    }
}
// @lc code=end

