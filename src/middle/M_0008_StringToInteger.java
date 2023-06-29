package middle;

// 题目不明确， 无重要考察点，没重做必要
public class M_0008_StringToInteger {

    public static void main(String[] args) {
        myAtoi ( "aaa 42");
    }

    public static int myAtoi(String s) {

        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for ( int i = 0 ; i < s.length() ; i ++){
            String now = s.substring(i , i + 1);
            int chr=s.charAt(i);

            // 开头 非 空 + - 数字，不继续向下
            if( !flag && !(  " ".equals(now) || "+".equals(now) || "-".equals(now) ||  (48 <= chr && chr <=57 ) ) ){
                break;
            }

            // 如果已经开始 ，但是不是数字，不继续向下
            if( flag &&  (48> chr || chr>57) ){
                break;
            }

            // 如果遇到 + - 则就开始
            if( !flag  &&  ("+".equals(now) || "-".equals(now)  )){
                flag = true ;
                if( "-".equals(now)){
                    sb.append("-");
                }
            }

            // 如果则字符则 开始 并且 继续处理
            if( 48<= chr && chr<=57){
                if(!flag)
                    flag = true;
                sb.append( now );
            }

        }

        String str =  sb. toString() ;
        int a = 0;
        try{
            a= Integer.valueOf(str );
        }catch (Exception e){
            // Nothing to do
            if( str.length() >= 10 ) {
                if (str.startsWith("-")) {
                    return Integer.MIN_VALUE;
                } else {
                    return Integer.MAX_VALUE;
                }
            }
        }
        return a;
    }

}
