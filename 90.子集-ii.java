import java.util.ArrayList;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=90 lang=java
 *
 * [90] 子集 II
 */

// @lc code=start
class Solution {
    private int len;
    //private Stack <Integer> stack = new Stack<Integer>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        this.len = nums.length;
        List<List<Integer>> res = new ArrayList();
        if(len == 0) {
            return res;
        }
        Arrays.sort(nums);
        recursive(nums, res, 0,new ArrayList<Integer>());
        return res;
    }
    private void recursive(int [] nums, List<List<Integer>> res,  int idx, ArrayList<Integer> stack) {
        res.add(new ArrayList<>(stack));

        for(int i=idx; i<len; i++) {
            if(i > idx && nums[i] == nums[i-1]) {
                continue;
            }
            stack.add(nums[i]);
            recursive(nums, res, i+1,stack);
            stack.remove(stack.size() - 1);
        }
    }
}
// @lc code=end

