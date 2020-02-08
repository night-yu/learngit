import java.util.ArrayList;
import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=18 lang=java
 *
 * [18] 四数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList();
        if(nums.length < 4) {
            return res;
        } else {
            Arrays.sort(nums);
            int len = nums.length;
            for(int k = 0; k<len - 3; k++) {
                if(k > 0 && nums[k] == nums[k - 1]) {
                    continue;
                }
                if(nums[k] + nums[k+1] + nums[k+2] + nums[k+3] > target) {
                    break;
                } else if (nums[k] + nums[len - 1] + nums[len-2] + nums[len - 3] < target) {
                    continue;
                }
                for(int i = k+1; i < len - 2;i++) {
                    if(i > k+1 && nums[i] == nums[i-1]) {
                        continue;
                    }
                    if(nums[k] + nums[i] + nums[i+1] + nums[i+2] > target) {
                        break;
                    } else if (nums[k] + nums[i] + nums[len - 1] + nums[len - 2] < target) {
                        continue;
                    } else {
                        int l = i+1;
                        int r = len - 1;
                        while (l < r) {
                            int sum = nums[k] + nums[i] + nums[l] + nums[r];
                            if(sum == target) {
                                res.add(Arrays.asList(nums[k], nums[i], nums[l], nums[r]));
                                while(l < r && nums[l] == nums[l + 1]) l++;
                                while (l < r && nums[r] == nums[r-1]) r--;
                                l++;
                                r--;
                            } else if (sum < target) {
                                l ++;
                            } else {
                                r --;
                            }
                        }
                    }
                }
            }
        }
        return res;
    }
}
// @lc code=end

