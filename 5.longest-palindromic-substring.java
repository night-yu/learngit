/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        int len = s.length();

        int longest_len = 1;
        String longest_s = s.substring(0, 1);
        boolean [][] dec = new boolean [len][len];

        for (int r=1;r<len;r++) {
            for (int l=0;l<r;l++) {
                if (s.charAt(l) == s.charAt(r) && (r-l <= 2 || dec[l + 1][r - 1])) {
                    dec[l][r] = true;
                
                    if ((r - l + 1) > longest_len) {
                        longest_len = r-l+1;
                        longest_s = s.substring(l, r+1);
                    }
                }
            }
        }
        return longest_s;
    }
}
// @lc code=end

