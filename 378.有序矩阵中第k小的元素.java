/*
 * @lc app=leetcode.cn id=378 lang=java
 *
 * [378] 有序矩阵中第K小的元素
 */

// @lc code=start
class Solution {
    private int r;
    private int c;
    public int kthSmallest(int[][] matrix, int k) {
        this.r = matrix.length;
        this.c = matrix[0].length;
        int left = matrix[0][0];
        int right = matrix[r - 1][c-1];
        int mid = 0;
        while(left < right) {
            mid = left + (right - left) / 2;
            int count = findSmall(matrix, mid);
            if(count < k) left = mid + 1;
            else right = mid;
        }
        return right;
    }

    private int findSmall(int [][] matrix, int mid) {
        int i = r - 1;
        int j = 0;
        int count = 0;
        while (i >= 0 && j < c) {
            if (matrix[i][j] <= mid) {
                // 第j列有i+1个元素<=mid
                count += i + 1;
                j++;
            } else {
                // 第j列目前的数大于mid，需要继续在当前列往上找
                i--;
            }
        }
        return count;
    }
}
// @lc code=end

