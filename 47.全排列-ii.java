import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=47 lang=java
 *
 * [47] 全排列 II
 */

// @lc code=start
class Solution {
    private Stack <Integer> stack = new Stack <Integer>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList();
        if(len == 0) {
            return res;
        }
        Arrays.sort(nums);
        boolean [] used = new boolean[len];
        Arrays.fill(used, false);
        recursive(nums, res, used, 0, len);
        return res;
    }

    private void recursive(int [] nums, List<List<Integer>> res, boolean [] used, int depth, int len) {
        if(depth == len) {
            res.add(new ArrayList(stack));
            return;
        }
        for(int i=0; i<len; i++) {
            if(i>0 && nums[i] == nums[i-1] && !used[i-1]) {
                continue;
            }
            if(!used[i]) {
                stack.add(nums[i]);
                used[i] = true;
                recursive(nums, res, used, depth+1, len);
                stack.pop();
                used[i] = false;
            }
        }
    }
}
// @lc code=end

