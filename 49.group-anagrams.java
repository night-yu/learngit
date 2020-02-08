import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start
class Solution {
    private Map<String, List<String>> map = new HashMap<String, List<String>>();
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) {
            return new ArrayList<>();
        }
        int[] arr = new int[26];
        for(String s : strs) {
            Arrays.fill(arr,0);
            for(char c : s.toCharArray()) {
                arr[c - 'a']++;
            }
            StringBuilder str = new StringBuilder("");
            for (int i=0; i<26; i++) {
                str.append(arr[i]);
                str.append("#");
            }
            String key = str.toString();
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
// @lc code=end

