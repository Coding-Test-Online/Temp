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
    public ListNode sortList(ListNode head) {
        int count = 0;
        ListNode tmp = head;
        
        while(tmp!=null){
            count++;
            tmp = tmp.next;
        }

        int[] arr = new int[count];
        tmp = head;
        count = 0;

        while(tmp!=null){
            arr[count++] = tmp.val;
            tmp = tmp.next;
        }
        
        Arrays.sort(arr);
        tmp = head;
        count = 0;
        while(tmp!=null){
            tmp.val = arr[count++];
            tmp = tmp.next;
        }
        return head;
    }
}
 