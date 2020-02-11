import java.util.Deque;
import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=225 lang=java
 *
 * [225] 用队列实现栈
 */

// @lc code=start
class MyStack {
    private Deque <Integer> q1;
    private Deque <Integer> q2;
    private int top;
    /** Initialize your data structure here. */
    public MyStack() {
        this.q1 = new LinkedList<Integer> ();
        this.q2 = new LinkedList<Integer> ();
        this.top = 0;
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q1.add(x);
        top = x;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while(q1.size() > 1) {
            top = q1.remove();
            q2.add(top);
        }
        int ans = q1.remove();
        Deque <Integer> q3 = q2;
        q2 = q1;
        q1 = q3;
        return ans;
    }
    
    /** Get the top element. */
    public int top() {
        return top;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

