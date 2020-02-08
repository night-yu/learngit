/*
 * @lc app=leetcode.cn id=61 lang=java
 *
 * [61] 旋转链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) {
            return head;
        }
        int len = 0;
        ListNode pre = head;
        while(pre != null) {
            len ++;
            pre = pre.next;
        }
        if(k % len == 0) {
            return head;
        }
        pre = head;
        ListNode l = pre;
        ListNode r = pre;
        for(int i=0; i<k % len;i++) {
            r = r.next;
        }
        while(r.next != null) {
            r = r.next;
            l = l.next;
        }
        r.next = pre;
        pre = l.next;
        l.next = null;
        return pre;
    }
}
// @lc code=end

