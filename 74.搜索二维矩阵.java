/*
 * @lc app=leetcode.cn id=74 lang=java
 *
 * [74] 搜索二维矩阵
 */

// @lc code=start
class Solution {
    private int r;
    private int c;
    public boolean searchMatrix(int[][] matrix, int target) {
        r = matrix.length;
        if(r == 0) {
            return false; // *
        }
        c = matrix[0].length;
        if(c == 0) {
            return false; // *
        }
        int above = 0;
        int bottom = r - 1;
        int mid = 0;
        
        while(above <= bottom) {
            mid = above + (bottom - above) / 2;
            
            if(matrix[mid][c - 1] == target) {
                return true;
            } else if (target < matrix[mid][c-1]) {
                bottom = mid - 1;
            } else {
                above = mid + 1;
            }
        }
        if(above >= r) return false; // *
        r = above;
        int left = 0;
        int right = c - 1;
        while(left <= right) {
            mid = left+ (right - left) / 2;
            if(matrix[r][mid] == target) {
                return true;
            } else if (target < matrix[r][mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
// @lc code=end

