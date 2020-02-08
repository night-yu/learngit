import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=345 lang=java
 *
 * [345] 反转字符串中的元音字母
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        int len = s.length();
        if(len <= 1) {
            return s;
        }
        StringBuilder str = new StringBuilder(s);
        int l = 0;
        int r = len - 1;
        Set <Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        while(l < r) {
            if(set.contains(s.charAt(l)) && set.contains(s.charAt(r))) {
                char tmp = s.charAt(l);
                str.setCharAt(l, s.charAt(r));
                str.setCharAt(r,tmp);
                l++;
                r--;
            } else if (set.contains(s.charAt(l))) {
                r--;
            } else {
                l++;
            }
        }
        return str.toString();
    }
}
// @lc code=end

