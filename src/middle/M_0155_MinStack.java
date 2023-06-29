package middle;

//数组：运行慢
public class M_0155_MinStack {

    int size = 0 ;
    int MaxSize = 16 ;
    int[] nums ;

    public M_0155_MinStack() {
        nums = new int[MaxSize];
    }

    public void push(int val) {
        if(size == MaxSize){
            resize();
        }
        nums[size] = val;
        size ++ ;
    }

    public void pop() {
//        if(size == 0){
//            //报错
//        }
        size -- ;
    }

    public int top() {
        return nums[size - 1 ];
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i < size ; i++){
            min = Math.min(min , nums[i]);
        }

        return min;
    }

    private void resize(){
        int[] ints = new int[MaxSize * 2];
        System.arraycopy( nums , 0 , ints , 0 , MaxSize  );
        nums = ints;
        MaxSize= MaxSize * 2 ;
    }

    //链表：运行时间只有3ms,空间与数组差不多
    class MinStack {
        private Node head;

        public void push(int x) {
            if(head == null)
                head = new Node(x, x);
            else
                head = new Node(x, Math.min(x, head.min), head);
        }

        public void pop() {
            head = head.next;
        }

        public int top() {
            return head.val;
        }

        public int getMin() {
            return head.min;
        }

        private class Node {
            int val;
            int min;
            Node next;

            private Node(int val, int min) {
                this(val, min, null);
            }

            private Node(int val, int min, Node next) {
                this.val = val;
                this.min = min;
                this.next = next;
            }
        }
    }

}
