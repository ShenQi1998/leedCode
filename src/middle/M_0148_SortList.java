package middle;

import java.util.ArrayList;
import java.util.Comparator;

public class M_0148_SortList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {

        ListNode a = new ListNode(4);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(1);
        ListNode d = new ListNode(3);

        a.next = b ;
        b.next = c ;
        c.next = d;

        ListNode z= sortList(a);
        while(z!= null){
            System.out.println(z.val);
            z =z.next;
        }
    }

//    这个写法太low
//    public static ListNode sortList(ListNode head) {
//
//        ArrayList<Integer> aList = new ArrayList<>();
//
//        while( head  != null){
//            aList.add(head.val);
//            head = head.next;
//        }
//
//        aList.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.intValue() - o2.intValue();
//            }
//        });
//
//        ListNode resultNode = new ListNode();
//
//        ListNode beNode = new ListNode();
//        resultNode = beNode;
//        for (Integer integer : aList) {
//            System.out.println(integer);
//            ListNode nowNode = new ListNode(integer);
//            beNode.next = nowNode;
//            beNode = nowNode;
//        }
//
//        return resultNode.next;
//
//    }

    public static ListNode merge(ListNode head1 , ListNode head2){

        ListNode resultNode = new ListNode();
        ListNode  listNode= resultNode;

        while (head1 != null || head2 != null){
            if(head1 == null) {
                listNode.next = head2;
                head2= head2.next;
            }else if(head2 == null){
                listNode.next = head1;
                head1= head1.next;
            }else{
                if(head1.val < head2.val){
                    listNode.next = head1;
                    head1= head1.next;
                }else{
                    listNode.next = head2;
                    head2= head2.next;
                }
            }
        }

        return resultNode.next;

    }

    public static ListNode medium(ListNode head1 , ListNode head2){

        if(head1 == null || head2 == null){
            return null;
        }

        //只剩一个节点了
        if(head1.next == head2){
            head1.next = null;
            return  head1;
        }

        ListNode fast = head1;
        ListNode slow = head1;
        while(fast != head2){
            fast = fast.next;
            slow = slow.next;
            if(fast != head2){
                fast= fast.next;
            }
        }

        return merge(  medium( head1,slow) , medium( slow , head2 ));

    }

    public static ListNode sortList(ListNode head) {
        return medium(head, null);
    }


}
