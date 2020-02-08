import java.awt.List;
import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=93 lang=java
 *
 * [93] 复原IP地址
 */

// @lc code=start
class Solution {
    private int len;
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<String>();
        this.len = s.length();
        recursive(res,s,new ArrayList<>(),0);
        return res;
    }

    private void recursive(List<String> res, String s,  List<String> cur, int idx) {
        if(cur.size() >= 4) {
            if(idx == len) {
                res.add(String.join(".", cur));
            }
            return;
        }
        for(int i=1; i<=3;i++) {
            if(idx + i > len) {
                break;
            }
            String seg = s.substring(idx,idx+i);
            
            if((seg.startsWith("0") && seg.length() > 1) || (i==3 && Integer.parseInt(seg) > 255)) {
                continue;
            }
            cur.add(seg);
            recursive(res,s,cur,idx+i);
            cur.remove(cur.size() - 1);
        }
    }
}
// @lc code=end

