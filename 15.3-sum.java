/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>> ();
        int len = nums.length;

        for (int i=0; i<nums.length; i++) {
            int left = i + 1;
            int right = len - 1;
            int piv = nums[i];
            while (left < right) {
                if (piv + nums[left] + nums[right] > 0) {
                    right --;
                } else if (piv + nums[left] + nums[right] < 0) {
                    left ++;
                } else {
                    ArrayList<Integer> sub = new ArrayList<>();
                    sub.add(piv);
                    sub.add(nums[left]);
                    sub.add(nums[right]);
                    if (!ans.contains(sub)) {
                        ans.add(sub);
                    }
                    left ++;
                    right --;
                }
            }
        }
        return ans;
    }
}
// @lc code=end

