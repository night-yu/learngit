/*
 * @lc app=leetcode id=47 lang=java
 *
 * [47] Permutations II
 */

// @lc code=start
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/*
 * @lc app=leetcode id=46 lang=java
 *
 * [46] Permutations
 */

// @lc code=start
class Solution {
    private List<List<Integer>> res = new ArrayList<>();
    private Stack<Integer> stack = new Stack<Integer>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return res;
        } else {
            Arrays.sort(nums);
            boolean[] used = new boolean[len];
            int depth = 0;
            recursive(len, used, depth, nums);
        }
        return res;
    }

    private void recursive(int _len, boolean[] _used, int _depth, int[] _nums) {
        if (_depth == _len) {
            res.add(new ArrayList<>(stack));
            return;
        } else {
            for (int i = 0; i < _len; i++) {
                if(i >0 && _nums[i] == _nums[i-1] && !_used[i-1]) {
                    continue;
                }
                if (!_used[i]) {
                    stack.push(_nums[i]);
                    _used[i] = true;
                    recursive(_len, _used, _depth + 1, _nums);
                    _used[i] = false;
                    stack.pop();
                }
            }
        }
    }
}
// @lc code=end

