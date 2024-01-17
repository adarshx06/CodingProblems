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
    public void reorderList(ListNode head) {

        if(head== null || head.next==null){
            return;
        }
        //will be first node of 1 list
        ListNode l1 = head;
        //will be last node of 1st list 
        ListNode prev = null;
        
        //will be first node of 2 list
        ListNode slow = head;

        //will be last node of 2 list
        ListNode fast = head;

        while(fast !=null &&fast.next!= null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;
        ListNode l2 = reverse(slow);

        merge(l1,l2);
    }

    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while (curr!=null){
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
    public void merge(ListNode l1, ListNode l2){
        while(l1!=null){
            ListNode l1_nxt = l1.next;
            ListNode l2_nxt = l2.next;

            l1.next = l2;

            if(l1_nxt ==null){
                break;
            }

            l2.next = l1_nxt;
            l1 = l1_nxt;
            l2 = l2_nxt;

        }
    }
}
