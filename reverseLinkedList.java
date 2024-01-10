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

class Solution {
    public ListNode reverseList(ListNode head) {
       //base case
       if(head == null || head.next == null){
           return head;
       }
       //condtion
       
       ListNode reversed = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return reversed;
       //recursive call

    }
}
