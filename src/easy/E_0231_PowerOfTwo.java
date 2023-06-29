package easy;

public class E_0231_PowerOfTwo {
    public boolean isPowerOfTwo(int n) {

//        if(n < 0 ){
//            return false;
//        }
//        String s = Integer.toBinaryString(n);
//        boolean haveOne = false;
//        for( int i =0 ; i < s.length() ; i ++ ){
//            if( "1".equals(s.substring(i, i +1) )){
//                if(!haveOne){
//                    haveOne = true;
//                }else{
//                    return false;
//                }
//            }
//        }
//        return haveOne;

       return n < 0  && ( n & (n -1 ) ) == 0 ;

    }
}
