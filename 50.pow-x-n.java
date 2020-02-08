/*
 * @lc app=leetcode id=50 lang=java
 *
 * [50] Pow(x, n)
 */

// @lc code=start
class Solution {
    public double myPow(double x, int n) {
        if  (n == 0) {return 1;}
        else if (n == 1) {return x;}
        else if (n == -1) {return 1/x;}
        else {
            double half = myPow(x, n / 2);
            double reset = myPow(x, n % 2);
            return half * half * reset;
        }
    }
}
// @lc code=end

