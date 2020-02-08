import java.util.Arrays;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=60 lang=java
 *
 * [60] 第k个排列
 */

// @lc code=start
class Solution {
    private Stack<Integer> stack = new Stack<Integer>();

    public String getPermutation(int n, int k) {
        String res = "";
        int[] fact = new int[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = i * fact[i - 1];
        }
        boolean[] used = new boolean[n + 1];
        Arrays.fill(used, false);
        recursive(n, k, res, fact, used, 1);
        for (int a : stack) {
            res += a;
        }
        return res;
    }
    private void recursive(int n, int k, String res, int[] fact, boolean[] used, int depth) {
        if (depth == n+1) {
            return;
        }
        for (int i = 1; i <= n; i++) {
            if(used[i]) {
                continue;
            }
            else if (fact[n - depth] < k) {
                k -= fact[n - depth];
                continue;
            } 
            else  {
                stack.add(i);
                used[i] = true;
                recursive(n, k, res, fact, used, depth + 1);
            }
        }
    }
}
// @lc code=end
