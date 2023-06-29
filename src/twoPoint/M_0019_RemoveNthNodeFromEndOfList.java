package twoPoint;

public class M_0019_RemoveNthNodeFromEndOfList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode returnHead = head;

        ListNode FNode = null;
        int index = 0 ;
        while ( head.next != null ){
            if( index == n- 1 ){
                FNode = head;
            }else if( index > n-1){
                FNode = FNode.next;
            }
            head = head.next;
        }

        return returnHead;
    }

}
