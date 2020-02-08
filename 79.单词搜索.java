/*
 * @lc app=leetcode.cn id=79 lang=java
 *
 * [79] 单词搜索
 */

// @lc code=start
class Solution {
    private boolean [][] hist;
    private int r;
    private int c;
    public boolean exist(char[][] board, String word) {
        this.r = board.length;
        this.c = board[0].length;
        if(r == 0 ) {
            return false;
        }
        int len = word.length();
        hist = new boolean [r][c];
        char [] arr = word.toCharArray();
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                if(board[i][j] == arr[0] && dfs(i, j, board,  arr, len,0) == true) {
                    return true;
                }
            }
        } 
        return false;
    }


    private boolean dfs(int i, int j, char [][] board, char [] arr, int len, int depth ) {
        if(depth == len) {
            return true;
        }
        if(i < 0 || j < 0 || i >= r || j >= c || hist[i][j] || board[i][j] != arr[depth]) {
            return false;
        }
        hist[i][j] = true;
        if(dfs(i+1, j, board, arr, len, depth+1) || dfs(i-1, j, board, arr, len, depth+1) || dfs(i, j+1, board, arr, len, depth+1) || dfs(i, j-1, board, arr, len, depth+1)) {
            return true;
        }
        hist[i][j] = false;
        return false;
    }
}
// @lc code=end

