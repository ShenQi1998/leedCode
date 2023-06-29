package hard;

public class H_J043_1 {

//1 - 9       1  + 0 * 9
//10 - 99     10 + 1 * 9
//100 -999    100 + 20 * 9
//1000 -9999  1000 + 300 * 9

//1234
//1 -> 1 * 300 + 235(等于1，增加1开头的个数) +  countDigitOne(234)
//2 -> 2 * 20  + 100（不等1，增加1开头的全部个数） + countDigitOne(34)
//3 -> 3 * 1   + 10（不等1，增加1开头的全部个数）  + countDigitOne(4)
//4 -> 1

    public static void main(String[] args) {
        int a = countDigitOne(1234);
        System.out.println(a);
    }

    public static int countDigitOne(int n) {
        if( n < 10 ) {
            if( n >= 1)
                return 1;
            return  0;
        }

        String strN = String.valueOf(n);
        int len = strN.length();

        int now  = Integer.valueOf( strN.substring( 0  , 1  ) );
        int lastSum = (len -1) * (int) Math.pow(10 , len - 2 );
        int evey_num =  0;
        int yishu = n % (int) (Math.pow( 10 , len - 1 ) );
        int yishuNum1 = countDigitOne ( yishu );
        if( now == 1 ){
            evey_num =yishu + 1 + yishuNum1;
        }else{
            evey_num = (int) Math.pow(10 , len - 1 ) + yishuNum1 ;
        }

        System.out.println(lastSum * now + evey_num );
        return lastSum * now + evey_num ;

    }

//
//    固定位数法
//    public int countDigitOne(int n) {
//        //高位
//        int high = n;
//        //低位
//        int low = 0;
//        //当前位
//        int cur = 0;
//        int count = 0;
//        int num = 1;
//        while (high != 0 || cur != 0) {
//            cur = high % 10;
//            high /= 10;
//            //这里我们可以提出 high * num 因为我们发现无论为几，都含有它
//            if (cur == 0) count += high * num;
//            else if (cur == 1) count += high * num + 1 + low;
//            else count += (high + 1) * num;
//            //低位
//            low = cur * num + low;
//            num *= 10;
//        }
//        return count;
//    }


}
