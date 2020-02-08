/*
 * @lc app=leetcode.cn id=357 lang=java
 *
 * [357] 计算各个位数不同的数字个数
 */

// @lc code=start
class Solution {
    boolean [] used;
    private int cnt;
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0) {
            return 1;
        } else if (n == 1) {
            return 10;
        }
        cnt = 0;
        used = new boolean [10];
        recursive(n,0);
        return cnt+1;
    }
    private void recursive(int n, int depth) {
        if(depth == n) {
            return;
        }
        for(int i=0; i<=9; i++) {
            if(depth == 0 && i == 0) continue;    
            if(!used[i]) {
                cnt++;
                used[i] = true;
                recursive(n, depth + 1);
                used[i] = false;
            }
        }
    }
}
// @lc code=end

