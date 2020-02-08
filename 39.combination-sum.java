import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Arrays;
/*
 * @lc app=leetcode id=39 lang=java
 *
 * [39] Combination Sum
 */

// @lc code=start
class Solution {
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Stack<Integer> stack = new Stack<Integer>();
        if (candidates.length == 0) {
            return res;
        }
        Arrays.sort(candidates);
        recursive(stack, target, candidates, 0);
        return res;
    }

    private void recursive(Stack<Integer> _stack, int residual, int[] _candidates, int index) {
        if (residual == 0) {
            res.add(new ArrayList<>(_stack));
            return;
        } else {
            for (int i = index; i < _candidates.length && residual - _candidates[i] >= 0; i++) {
                _stack.add(_candidates[i]);
                recursive(_stack, residual - _candidates[i], _candidates, i);
                _stack.pop();
            }
            return;
        }
    }
}
// @lc code=end
