import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> hashmap = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int comp = target - nums[i];
            if(hashmap.containsKey(comp)) {
                return new int[] {hashmap.get(comp),i};
            }
            hashmap.put(nums[i],i);
        }
        return null;
    }
}
// @lc code=end

