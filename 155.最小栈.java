/*
 * @lc app=leetcode.cn id=155 lang=java
 *
 * [155] 最小栈
 */

// @lc code=start
class MinStack {
    class Node{
        private int value;
        private int min;
        Node next;
        public Node(int _value, int _min, Node _next) {
            this.value = _value;
            this.min = _min;
            this.next = _next;
        }
    }
    private Node head;
    /** initialize your data structure here. */
    public MinStack() {
        this.head = null;
    }
    
    public void push(int x) {
        if(head == null) head = new Node(x,x,null);
        else {
            Node aux = new Node(x, Math.min(x,head.min),head);
            head = aux;
        }
    }
    
    public void pop() {
        if(head != null) {
            head = head.next;
        }
    }
    
    public int top() {
        if(head != null) {
            return head.value;
        } 
        return -1;
    }
    
    public int getMin() {
        if(head != null)  return head.min;
        return -1;
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

