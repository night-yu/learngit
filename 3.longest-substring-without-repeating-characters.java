/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
import java.util.Hashtable;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        int left = 0;
        int right = 0;
        char [] aux = s.toCharArray();
        Hashtable <Character, Integer> table = new Hashtable<Character, Integer>();
        while (right < s.length()) {
            if(!table.containsKey(aux[right])) {
                table.put(aux[right],right);
                length = Math.max(length, right - left + 1);
                right ++;
            } else {

                left = table.get(aux[right]);
                int pos = left;
                while(table.containsValue(pos) && pos >= 0) {
                    table.remove(aux[pos],pos);
                    pos --;
                }
                left ++;

            }
        }
        return length;
    }
}
// @lc code=end

