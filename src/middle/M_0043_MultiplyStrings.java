package middle;
 /**
//思路一 ： 正常的乘法计算
 *               1   2   3
 *          x    4   5   6
 *  ----------------------
 *               7   3   8
 *           6   1   5   0
 *       4   9   2   0   0
 *  ----------------------
 *           6   8   8   8
 *       4   9   2   0   0
 *  ----------------------
 *       5   6   0   8   8

// 思路二 升级的乘法计算
 *               9   9   9
 *         ×     6   7   8
 *  ----------------------
 *              72  72  72
 *          63  63  63
 *      54  54  54
 *  ----------------------
 *      54 117 189 135  72
 *  ----------------------
 *      54 117 189 142   2
 *  -----------------------
 *      54 117 203   2   2
 *  -----------------------
 *      54 137   3   2   2
 *  -----------------------
 *      67   7   3   2   2
 *  -----------------------
 *   6   7   7   3   2   2

*/
public class M_0043_MultiplyStrings {
    public static void main(String[] args) {
        multiply( "123" , "456");
    }

    public static String multiply(String num1, String num2) {
        if ( num1.equals( "0") || num2.equals( "0")){
            return  "0";
        }

        StringBuilder sum = new StringBuilder();
        for ( int i =  num2.length() - 1 ; i >=0  ; i -- ){
            int nowNum2 = Integer.valueOf(num2.substring(  i , i+1 ) );
            int jinwei = 0 ;
            StringBuilder nowMul = new StringBuilder();

            for( int z  = num2.length() - 1 - i ; z>0 ; z--){
                nowMul.append("0");
            }

            for ( int j = num1.length() - 1 ; j >= 0  ; j-- ){
                int nowNum1 = Integer.valueOf( num1.substring(j , j + 1) );
                int now = nowNum2 * nowNum1 + jinwei;
                jinwei = 0;
                if(now >= 10  ){
                    jinwei = now / 10  ;
                    now = now % 10 ;
                }
                nowMul.append(now);
            }

            if(jinwei != 0){
                nowMul.append(jinwei);
            }
            sum = add(sum.toString() ,nowMul.toString() );
        }
        sum = sum.reverse();
        System.out.println(sum .toString());
        return  sum.toString();

    }

    private static StringBuilder add (String str1  , String str2  ){
        System.out.println(str1 + "-" + str2 );
        StringBuilder sb = new StringBuilder();
        int nowIndex = 0  ;
        int first = 0 ;
        int second = 0 ;
        int jinwei = 0 ;
        while ( nowIndex < str1.length() || nowIndex < str2.length()  || jinwei == 1 ){

            if( nowIndex >= str1.length() ){
                first = 0 ;
            }else{
                first = Integer.valueOf( str1.substring( nowIndex , nowIndex + 1 ) );
            }

            if( nowIndex >= str2.length() ){
                second = 0 ;
            }else{
                second = Integer.valueOf( str2.substring( nowIndex , nowIndex + 1 ) );
            }


            int sum = first + second + jinwei ;
            jinwei = 0 ;
            if( sum >= 10){
                sum = sum - 10 ;
                jinwei = 1;
            }
            nowIndex ++ ;
            sb.append(sum );
        }
        return  sb ;
    }
}
