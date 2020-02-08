import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=46 lang=java
 *
 * [46] 全排列
 */

// @lc code=start
class Solution {
    private Stack <Integer> stack = new Stack <Integer> ();
    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList();
        if(len == 0) {
            return res;
        }
        boolean [] used = new boolean[len];
        Arrays.fill(used, false);
        recursive(res, nums, used, 0, len);
        return res;
    }

    private void recursive(List<List<Integer>> res, int[] nums, boolean [] used, int depth, int len) {
        if(depth == len) {
            res.add(new ArrayList<>(stack));
            return;
        }
        for(int i=0; i<len; i++) {
            if(!used[i]) {
                stack.add(nums[i]);
                used[i] = true;
                recursive(res, nums, used, depth + 1, len);
                stack.pop();
                used[i] = false;
            }
        }
    }
}
// @lc code=end

