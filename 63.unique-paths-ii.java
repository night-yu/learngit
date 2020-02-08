import java.util.Arrays;

/*
 * @lc app=leetcode id=63 lang=java
 *
 * [63] Unique Paths II
 */

// @lc code=start
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0] == 1) {
            return 0;
        } else {
            int n = obstacleGrid[0].length;
            int m = obstacleGrid.length;
            int aux_m = 0;
            int aux_n = 0;
            for(int i=0;i<m;i++) {
                for(int j=0;i<n;j++) {
                    if(obstacleGrid[i][j] == 1) {
                        aux_m = m;
                        aux_n = n;
                        break;
                    }
                }
            }
            int [] cur = new int[n];
            
            
            Arrays.fill(cur, 1);
            if(aux_m == 0) {
                cur[aux_n] = 0;
            }

            for(int i=1;i<m;i++) {
                for(int j=1;j<n;j++) {
                    cur[j] = cur[j] + pre[i];
                }
            }

        }
    }
}
// @lc code=end

