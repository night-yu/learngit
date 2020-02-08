import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=216 lang=java
 *
 * [216] 组合总和 III
 */

// @lc code=start
class Solution {
    private List<List<Integer>> res;

    public List<List<Integer>> combinationSum3(int k, int n) {
        this.res = new ArrayList<>();
        if (n == 0) {
            return res;
        }
        recursive(k, n, new ArrayList<Integer>(), 0, 1);
        return res;
    }

    private void recursive(int k, int n, ArrayList<Integer> ans, int depth, int idx) {
        if (depth == k  && n == 0) {
            res.add(new ArrayList<>(ans));
            return;
        }
        for (int i = idx; i <= 9; i++) {

            ans.add(i);
            recursive(k, n - i, ans, depth + 1, i + 1);
            ans.remove(ans.size() - 1);

        }
    }
}
// @lc code=end
