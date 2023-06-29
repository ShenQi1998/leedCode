package middle;

public class M_0002_AddTwoNumbers {

    public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode listNode = new ListNode();
        ListNode tempListNode = listNode;

        int nextFlag = 0 ;
        while(l1 != null || l2 != null || nextFlag == 1){
            int a = 0;
            if(l1 !=null){
                a = l1.val;
                l1 = l1.next ;
            }

            int b = 0;
            if(l2 !=null){
                b = l2.val;
                l2 = l2.next ;
            }

            int c = a + b + nextFlag;

            nextFlag = 0 ;
            if(c >= 10 ){
                c = c - 10 ;
                nextFlag = 1 ;
            }

            ListNode listNode1 = new ListNode(c);
            tempListNode.next = listNode1 ;
            tempListNode =  tempListNode.next ;

        }
        return  listNode.next;
    }
}
