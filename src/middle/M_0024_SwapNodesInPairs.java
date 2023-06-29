package middle;


public class M_0024_SwapNodesInPairs {

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        a.next = b;
        b.next = c ;
        c.next = d ;

        ListNode z = swapPairs(a);
        while(z!= null){
            System.out.println(z.val);
            z =z.next;
        }
    }

public static class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

//    public static ListNode swapPairs(ListNode cur) {
//        if(cur== null || cur.next == null){
//            return cur ;
//        }
//
//        ListNode pre = cur.next;
//        while (cur != null && cur.next != null) {
//            ListNode tempNode = cur.next.next;
//            cur.next.next = cur;
//            if (tempNode != null && tempNode.next != null) {
//                cur.next = tempNode.next;
//            } else {
//                cur.next = tempNode;
//            }
//
//            cur = tempNode;
//        }
//        return pre;
//    }


// 递归！！！！！！！！！！！！！
    public static ListNode swapPairs(ListNode cur) {
        if(cur== null || cur.next == null){
            return cur ;
        }

        ListNode tempListNode = cur.next;
        cur.next = swapPairs(cur.next.next);
        tempListNode.next = cur;

        return tempListNode;
    }

}
