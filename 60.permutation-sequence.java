import java.util.Stack;

/*
 * @lc app=leetcode id=60 lang=java
 *
 * [60] Permutation Sequence
 */

// @lc code=start
class Solution {
    private Stack <Integer> stack = new Stack <>();
    private String res = "";
    public String getPermutation(int n, int k) {
        
        int [] fact = new int [n+1];
        boolean [] used = new boolean[n + 1];
        
        construct_fact(fact, n);
        if(fact[n] < k) {
            return "";
        } else if (n == 1 && k == 1) {
            return "1";
        }
        recursive(0,n,k,used,fact);
        for(int a : stack) {
            res += a;
        }
        return res;
    }
    private void construct_fact(int [] _fact, int _n) {
        _fact[0] = 1;
        for(int i=1; i<=_n;i++) {
            _fact[i] = i * _fact[i-1];
        }
    }

    private void recursive(int depth, int _n, int _k, boolean[] _used, int []_fact) {
        if(depth == _n) {
            return;
        }
        for(int i=1; i<=_n;i++) {
            if(_used[i]) {
                continue;
            } else if(_fact[_n-1-depth] < _k) {
                _k -= _fact[_n-1-depth];
                continue;
            } else{
                stack.add(i);
                _used[i] = true;
                recursive(depth + 1, _n, _k, _used, _fact);
            }
        }
    }
}
// @lc code=end

