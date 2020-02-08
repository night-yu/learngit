/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) {
            return true;
        } 
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        while(fast != null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        slow = slow.next;
        ListNode aux = slow.next;
        slow.next = null;
        while(aux != null) {
            ListNode tmp = aux.next;
            aux.next = slow;
            slow = aux;
            aux = tmp;
        }
        
        while(slow != null) {
            if(head.val != slow.val) {
                return false;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
}
// @lc code=end

