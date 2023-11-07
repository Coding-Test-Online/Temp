/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        while (head != null) {
            if (head.val == 10000001) return true;
            head.val = 10000001;
            head = head.next;
        }
        return false;
    }
}