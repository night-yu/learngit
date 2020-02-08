import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=131 lang=java
 *
 * [131] 分割回文串
 */

// @lc code=start
class Solution {
    private int len;

    public List<List<String>> partition(String s) {
        this.len = s.length();
        List<List<String>> res = new ArrayList();
        if(len == 0) {
            return res;
        }
        recursive(s, res, new ArrayList<>(), 0);
        return res;
    }

    private void recursive(String s, List<List<String>> res,  List<String> ans, int idx) {
        if(idx >= s.length()) {
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int i=1; i<=s.length(); i++) {
            if(idx + i > s.length()) {
                break;
            }
            String seg = s.substring(idx, idx + i);
            if(check(seg)) {
                ans.add(seg);
                recursive(s, res, ans, idx + i);
                ans.remove(ans.size() - 1);
            }
        }
    }

    private boolean check(String seg) {
        int l = 0;
        int r = seg.length() - 1;
        while(l < r) {
            if(seg.charAt(l) != seg.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
// @lc code=end

