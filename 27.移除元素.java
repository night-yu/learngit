/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        if(len == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int l = 0;
        int r = l;
        while(r < len) {
            if(nums[r] != val) {
                nums[l] = nums[r];
                l++;
            } 
            r++;
            
        }
        return l;
    }
}
// @lc code=end

