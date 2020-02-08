/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int fast = 0;
        int slow = 0;

        while (fast < nums.length) {
            if(nums[slow] == nums[fast]) {
                fast ++;
                
            } else {
                slow ++;
                nums[slow] = nums[fast];
                fast ++;
            }
        }
        return slow + 1;
    }
}
// @lc code=end

