package math;


//输入：x = 123
//输出：321

public class M_0007_ReverseInteger {

    public static void main(String[] args) {
        reverse( 123456);
    }

//    public static int reverse(int x) {
//
//        boolean nav = false;
//        if( x < 0){
//            x =- x;
//            nav = true;
//        }
//
//        String num = x + "";
//        String result = "" ;
//        for ( int i = 0 ; i< num.length() ; i ++){
//            String now = num.substring(i , i +1);
//            result = now + result   ;
//        }
//        int res = 0;
//        try {
//            res = Integer.valueOf(result);
//        }catch (Exception e){
//
//        }
//
//        if(nav)
//            res = - res;
//
//        return res;
//
//    }

    public static int reverse(int x) {
        long n = 0;
        while (x != 0) {
            n = n * 10  + (x % 10) ;
            x = x / 10;
        }
        return (int)n==n? (int)n:0;
    }

}
