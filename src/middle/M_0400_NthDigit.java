package middle;



public class M_0400_NthDigit {

    public static void main(String[] args) {
        findNthDigit(3);
    }

    public static int findNthDigit(int n) {

        int weishu = 1 ;

        while ( true ){

            int thisWeishu = (int) (9 * Math.pow(10 , (weishu- 1) ) * weishu);
            int now = n - thisWeishu ;

            if( now > 0){
                n =now;
                weishu ++ ;
            }
            else {
                break;
            }
        }

//        System.out.println( " 位数" + weishu + "   n:" +  n);
        int start = (int) Math.pow(10 , weishu - 1);
//        if(start == 1){
//            start = 0 ;
//        }
        int shuzi = start + (n  / weishu)   ;
        int yushu = n % weishu;

        if(yushu == 0){
            shuzi = shuzi - 1 ;
            yushu = weishu;
        }
//        System.out.println("shuzi " +shuzi  + "  yushu " + yushu);
        String str = String.valueOf(shuzi);

        str =str.substring(yushu - 1  , yushu  );
        System.out.println(str);
        return Integer.valueOf(str);
    }


    //补位法
//    public static int findNthDigit(int n1) {
//
//        double n = n1;
//        int weishu = 1;
//        while (n > weishu * Math.pow(10, weishu)) {
//            n = (n + Math.pow(10, weishu));
//            weishu++;
//        }
//
//        int num = (int) (n / weishu);
//        int wei = (int) (n % weishu);
//        return Integer.valueOf(String.valueOf(num).substring(wei, wei + 1));
//    }
}
