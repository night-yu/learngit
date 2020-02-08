/*
 * @lc app=leetcode.cn id=306 lang=java
 *
 * [306] 累加数
 */

// @lc code=start
class Solution {
    private int len;
    private int[] aux;

    public boolean isAdditiveNumber(String num) {
        this.len = num.length();
        if (len < 3) {
            return false;
        }
        aux = new int[3];
        return recursive(num, 0, 0);
    }

    private boolean recursive(String num, int start, int depth) {
        if (depth == 3) {
            if (aux[0] + aux[1] != aux[2]) {
                return false;
            }
            /*for(int a:aux) {
                System.out.println(a);
            }*/
            int [] tmp = aux.clone();
            tmp[0] = tmp[1];
            tmp[1] = tmp[2];
            boolean flag = true;
            int count = start + 1;
            while(count <= len) {
                if(num.substring(start,count).startsWith("0")) {
                    count ++;
                    flag = false;
                    continue;
                }
                tmp[2] = Integer.parseInt(num.substring(start, count));
                System.out.println(tmp[2]);
                if(tmp[2] > tmp[1] + tmp[0]) {
                    //
                    return false;
                }
                if(tmp[0] + tmp[1] == tmp[2]) {
                    tmp[0] = tmp[1];
                    tmp[1] = tmp[2];
                    flag = true;
                    start = count;
                } 
                count ++;
            }
            return true && flag;
        }

        for (int i = 1; i <= len / 2; i++) {
            if (start + i <= len) {
                String seg = num.substring(start, start + i);
                if(!seg.startsWith("0") || seg.equals("0")){
                    aux[depth % 3] = Integer.parseInt(seg);
                }
            }
            if(aux[0] + aux[1] < aux[2]) break;
            if (recursive(num, start + i, depth + 1))  {
                return true;
            }
        }
        return false;
    }
}
// @lc code=end
