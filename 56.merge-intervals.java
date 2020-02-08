import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */

// @lc code=start
class Solution {
    private List<int[]> res= new ArrayList<>();
    public int[][] merge(int[][] intervals) {
        
        if(intervals.length== 0 || intervals.length == 1) {
            return intervals;
        } else {
            Arrays.sort(intervals,(a,b)->a[0]-b[0]);
            for(int i=0; i<intervals.length;i++){
                int left = intervals[i][0];
                int right = intervals[i][1];
                while(i<intervals.length - 1 && intervals[i+1][0] <= right) {
                    i++;
                    right = Math.max(right, intervals[i][1]);
                }
                res.add(new int[]{left,right});
            }
            return res.toArray(new int[0][]);
        }
    }
}
// @lc code=end

