package easy;



public class E_0021_MergeTwoSortedLists {

    public static void main(String[] args) {



    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode listNode = new ListNode();
        ListNode newListNode = listNode;

        while(list1 != null || list2 != null ){

            int a = Integer.MAX_VALUE;
            if(list1 != null){
                a = list1.val ;

            }
            int b = Integer.MAX_VALUE;
            if(list2 != null){
                b = list2.val ;
            }

            ListNode nowListNode = new ListNode();
            if(a <= b){
                nowListNode.val = a;
                list1 =list1.next;
            }else{
                nowListNode.val = b;
                list2 =list2.next ;
            }
            newListNode.next = nowListNode;
            newListNode = newListNode.next;


        }

        return listNode.next;
    }

}
