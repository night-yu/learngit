/*
 * @lc app=leetcode.cn id=275 lang=java
 *
 * [275] H指数 II
 */

// @lc code=start
class Solution {
    public int hIndex(int[] citations) {
        int len = citations.length;
        if( len == 0 || citations[len - 1] == 0) {
            return 0;
        }
        int l = 0;
        int r = len - 1;
        int mid = 0;
        while(l < r) {
            mid = l + (r - l) / 2;
            if(citations[mid] < len - mid) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return len - l;
    }
}
// @lc code=end

