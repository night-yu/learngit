/*
 * @lc app=leetcode.cn id=75 lang=java
 *
 * [75] 颜色分类
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        int len = nums.length;
        if(len < 2) {
            return;
        }
        int zero = 0;
        int two = len;
        int i = zero;
        while(i < two) {
            if(nums[i] == 0) {
                swap(nums, i, zero);
                i++;
                zero ++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                two --;
                swap(nums, i, two);
            }
        }
    }
    private void swap(int [] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
// @lc code=end

