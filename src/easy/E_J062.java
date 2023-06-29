package easy;

public class E_J062 {


    //正常算会超时
    //采用固定公式
    // 公式推导 https://www.zhihu.com/tardis/bd/art/121159246?source_id=1001
    public static void main(String[] args) {
//        int[] ints = new int[10];
        lastRemaining(5 ,3);
        //64165
    }

//    public static int lastRemaining(int n, int m) {
//        m -- ;
//        int[] ints = new int[n];
//
//        int shengyu = n ;
//        int index = 0 ;
//        int cishu =0 ;
//
//        while(shengyu > 1){
//            if(index == n){
//                index =0;
//            }
//
//            if(ints [index] == 0){  //正常的节点
//                if( cishu < m){
//                    cishu ++ ;
//                }else{
//                    ints [index] = 1;
//                    cishu = 0;
//                    shengyu --;
//                }
//            }
//
//            index ++ ;
//        }
//
//        for( int i =0 ; i < n ; i++){
//            if( ints[i] == 0 ){
//                System.out.println(i);
//                return i;
//            }
//        }
//
//        return 0 ;
//
//    }

    public static int lastRemaining(int n, int m) {
        int ans = 0;
        for (int i = 2; i <= n; i++) {
            ans = (ans + m) % i;
            System.out.println(ans);
        }
        return ans;
    }
}
