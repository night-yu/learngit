/*
 * @lc app=leetcode.cn id=16 lang=java
 *
 * [16] 最接近的三数之和
 */

// @lc code=start
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int res = nums[0] + nums[1] + nums[2];;
        int sum = 0;
        
        //int ans = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0; i<nums.length - 2;i++) {
            int l = i + 1;
            int r = nums.length - 1;
            while ( l < r) {
                sum = nums[i] + nums[l] + nums[r];
                if (Math.abs(target - res) > Math.abs(target - sum)) {
                    res = sum;
                }
                if(sum > target) {
                    r--;
                } else if (sum < target) {
                    l++;
                } else {
                    return sum;
                }
            }
        }
        return res;
    }
}
// @lc code=end

