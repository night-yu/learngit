import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=349 lang=java
 *
 * [349] 两个数组的交集
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet();
        int len1 = nums1.length;
        int len2 = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        if(len1*len2 == 0) return new int[0];
        int ptr1 = 0;
        int ptr2 = 0;
        while(ptr1 != len1 && ptr2 != len2) {
            if(nums1[ptr1] == nums2[ptr2]) {
                set.add(nums1[ptr1]);
                ptr1++;
                ptr2++;
            } else if(nums1[ptr1] < nums2[ptr2]) ptr1++;
            else ptr2++;
        }
        int [] res = new int [set.size()];
        int i=0;
        for(int item : set) {
            res[i] = item;
            i++;
        }
        return res;
    }
}
// @lc code=end

