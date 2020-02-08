

/*
 * @lc app=leetcode id=31 lang=java
 *
 * [31] Next Permutation
 */

// @lc code=start
import java.util.*;
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int small = -1;
        for(int i=nums.length - 2;i>=0;i--) {
            if(nums[i] < nums[i+1]) {
                small = i;
                break;
            }
        }
        if (small == -1) {
            Arrays.sort(nums);
            return;
        } else {
            
            int index = nums.length - 1;
            while(nums[index] <= nums[small]) {
                index --;
            }
            swap(nums, index,small);           
            Arrays.sort(nums, small+1, nums.length); // Important!!
        }
    }
    public void swap(int[] _nums, int _a, int _b) {
        int temp = _nums[_a];
        _nums[_a] = _nums[_b];
        _nums[_b] = temp;
        return;
    }
}
// @lc code=end

