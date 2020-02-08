import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=40 lang=java
 *
 * [40] 组合总和 II
 */

// @lc code=start
class Solution {
    private Stack <Integer> stack = new Stack <Integer>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int len = candidates.length;
        List<List<Integer>> res = new ArrayList();
        if(len == 0 || len == 1 && candidates[0] != target) {
            return res;
        }
        Arrays.sort(candidates);
        recursive(candidates, res, target, 0, len);
        return res;
    }

    private void recursive(int [] candidate, List<List<Integer>> res, int residual, int idx, int len) {
        if(residual == 0) {
            res.add(new ArrayList<>(stack));
            return;
        }
        for(int i=idx; i<len && residual - candidate[i] >= 0; i++) {
            if(i > idx && candidate[i] == candidate[i-1]) {
                continue;
            }
            
                stack.add(candidate[i]);
                recursive(candidate, res, residual - candidate[i], i + 1, len);
                stack.pop();
            
        }
    }
}
// @lc code=end

