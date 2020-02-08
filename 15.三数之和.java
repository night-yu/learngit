import java.util.ArrayList;
import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        Arrays.sort(nums);
        if(nums.length < 3) {
            return ans;
        } else {
            int l = 0;
            int r = 0;
            int sum = -1;
            for (int i=0; i<nums.length; i++) {
                l = i + 1;
                r = nums.length - 1;
                if(nums[i] > 0) {
                    break;
                } else if (i > 0 && nums[i] == nums[i-1]) {
                    continue;
                } else {
                    while (l < r) {
                        sum = nums[i] + nums[l] + nums[r];
                        if(sum == 0) {
                            ans.add(Arrays.asList(nums[i], nums[l], nums[r]));
                            while(l < r && nums[l] == nums[l+1]) {
                                l ++;
                            }
                            while(l < r && nums[r] == nums[r-1]) {
                                r --;
                            }
                            l++;
                            r--;
                        } else if (sum < 0) {
                            l ++;
                        } else {
                            r --;
                        }
                    }
                }
            }
        }
        return ans;
    }
}
// @lc code=end

