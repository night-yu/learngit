import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/*
 * @lc app=leetcode id=40 lang=java
 *
 * [40] Combination Sum II
 */

// @lc code=start
class Solution {
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
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
                if(i > index && _candidates[i] == _candidates[i-1]) {
                    continue;
                }
                _stack.add(_candidates[i]);
                recursive(_stack, residual - _candidates[i], _candidates, i+1);
                _stack.pop();
            }
            return;
        }
    }
}
// @lc code=end
// @lc code=end

