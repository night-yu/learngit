/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2.length == 0) {
            return;
        }
        int tail1 = m - 1;
        int tail2 = n-1;
        int tail = m+n-1;
        while(tail1 >=0 && tail2 >=0) {
            if(nums1[tail1] >= nums2[tail2]) {
                nums1[tail] = nums1[tail1];
                tail1 --;
            } else {
                nums1[tail] = nums2[tail2];
                tail2 --;
            }
            tail --;
        }
        System.arraycopy(nums2, 0, nums1, 0, tail2+1);
    }
}
// @lc code=end

