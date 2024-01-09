//reserve linked list 

// Iterative approach

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        ListNode nextNode;
        
        while(current!=null){
            nextNode = current.next;
            current.next = previous;
            previous = current;
            current =nextNode;

        }
        return previous;

    }
}

//Recursive Approach

