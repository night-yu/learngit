/*
 * @lc app=leetcode.cn id=86 lang=java
 *
 * [86] 分隔链表
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
    public ListNode partition(ListNode head, int x) {
        if(head == null) {
            return null;
        }
        ListNode small = new ListNode(0);
        ListNode s = small;
        ListNode large = new ListNode(0);
        ListNode l = large;
        while(head != null) {
            if(head.val < x) {
                s.next = head;
                s = s.next;
            } else {
                l.next = head;
                l = l.next;
            }
            head = head.next;
        }
        l.next = null;
        s.next = large.next;
        return small.next;
    }
}
// @lc code=end

