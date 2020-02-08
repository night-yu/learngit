import java.util.ArrayList;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=77 lang=java
 *
 * [77] 组合
 */

// @lc code=start
class Solution {
    Stack <Integer> stack = new Stack<Integer>();
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList();
        if(k > n) {
            return res;
        }
        recursive(res, n, k, 1, 1);
        return res;
    }

    private void recursive(List<List<Integer>> res, int n, int k, int idx, int depth) {
        if(depth == k + 1) {
            res.add(new ArrayList<>(stack));
            return;
        }

        for(int i=idx; i<=n-(k-stack.size())+1; i++) {
            stack.add(i);
            recursive(res, n, k, i+1, depth+1);
            stack.pop();
        }
    }
}
// @lc code=end

