package easy;

public class E_0191_NumberOf1Bits {



    public int hammingWeight(int n) {
//        String nTo2 = Integer.toBinaryString(n);
//        int sum = 0 ;
//        for (int i = 0 ; i < nTo2.length() ; i ++){
//            if( "1" .equals( nTo2.substring(i , i + 1 ))){
//                sum ++ ;
//            }
//        }
//        return  sum;


        // 需要技巧
        //n &= n - 1其运算结果恰为把 n 的二进制位中的最低位的 1 变为 0 之后的结果
        int ret = 0;
        while (n != 0) {
            n &= n - 1;
            ret++;
        }
        return ret;

    }
}
