/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int l=0;
        int r = l + 1;
        if(len <= 1) {
            return len;
        } else {
            Arrays.sort(nums);
            while(r < len) {

                if(nums[r] != nums[l]) {
                    if(r-l > 1) {
                        nums[l+1] = nums[r];
                    }
                    l ++;
                } 
                r++;
            }
        }
        return l + 1;
    }
}
// @lc code=end

