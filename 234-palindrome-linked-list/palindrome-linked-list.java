/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
          
        ListNode dummy = null;
        ListNode temp = head;

        while (temp != null) {
            ListNode p = new ListNode(temp.val);
            p.next = dummy;
            dummy = p;
            temp = temp.next;
        }

        while (head != null) {
            if (head.val != dummy.val) {
                return false;
            }

            head = head.next;
            dummy = dummy.next;
        }

        return true;
    }
}