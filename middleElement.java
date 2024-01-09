//Approach 1 O(n)
class Solution {
    public ListNode middleNode(ListNode head) {
        int len = 0;
        ListNode temp = head;
        while(temp!=null){
            len++;
            temp= temp.next;
        }
        temp = head;
        int mid=len/2;
        for(int i =0;i<mid;i++){
            temp = temp.next;
        }
        return temp;
    }


//Approach 2 Two pointer method

public ListNode middleNode(ListNode head) {
    ListNode f = head;
    ListNode s = head;
    while (f != null && f.next != null) {
        f = fast.next.next;
        s = slow.next;
    }
    return s;
}
