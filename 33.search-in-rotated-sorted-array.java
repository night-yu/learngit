/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        if(len == 0) {
            return -1;
        } else if (len == 1) {
            return (nums[0] == target ? 0 : -1);
        }
        int left = 0;
        int right = len - 1;
        while(left <= right) {
            System.out.printf("%d, %d\n",left, right);
            int mid = (right - left) / 2 + left;
            System.out.println(mid);
            if(nums[mid] == target) {
                
                return mid;
            } 
            if (nums[mid] < nums[left]) {

                if(target > nums[mid] && target <= nums[right]){
                // right is sorted
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            else {
                if (target < nums[mid] && target >= nums[left]){
                // left is sorted
                right = mid - 1;
                }  else {
                    left = mid + 1;
                }
            }
            
        }
        return -1;
    }
}
// @lc code=end

