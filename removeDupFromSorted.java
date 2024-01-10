//o(n)
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while(curr != null ){
            while(curr.next != null && curr.val == curr.next.val){
                curr.next = curr.next.next;
            }
            curr=curr.next;
        }
        return head;
    }
}

//o(1) linear 
public ListNode deleteDuplicates(ListNode head) {
    ListNode current = head;
    
    while (current != null && current.next != null) {
        if (current.val == current.next.val) {
            current.next = current.next.next;
        } else {
            current = current.next;
        }
    }
    
    return head;
}
