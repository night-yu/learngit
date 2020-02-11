import java.util.Deque;
import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=155 lang=java
 *
 * [155] 最小栈
 */

// @lc code=start
class MinStack {
    private Deque <Long> stack;
    private long min;
    /** initialize your data structure here. */
    public MinStack() {
        this.min = Long.MAX_VALUE;
        this.stack = new LinkedList<Long>();
    }
    
    public void push(int x) {
        if(stack.isEmpty()) {
            this.min = x;
            stack.push(x - min);
        } else {
            stack.push(x - min);
            if(x - min < 0) min = x;
        }
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
        if(stack.peek() < 0) min = min - stack.peek();
        stack.pop();
    }
    
    public int top() {
        if(stack.peek() <= 0) return (int) min;
        return (int) (min + stack.peek());
    }
    
    public int getMin() {
        return (int) min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
// @lc code=end

