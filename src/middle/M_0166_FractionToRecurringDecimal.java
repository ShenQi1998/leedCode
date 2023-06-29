package middle;

import java.util.HashMap;
//这道题 太难了

public class M_0166_FractionToRecurringDecimal {

    public static void main(String[] args) {
        String a =fractionToDecimal(-2147483648, 12 );
        System.out.println(a);
    }
    public static String fractionToDecimal(int numerator, int denominator) {

        StringBuilder sb = new StringBuilder();

        long a = numerator, b = denominator;
        if ( (a > 0 && b < 0 ) || (a < 0 && b > 0) ) sb.append('-');
        a = Math.abs(a);
        b = Math.abs(b);

        HashMap<Long, Integer> m = new HashMap<>();

        long zhengshu =  a / b;
        long yushu  = a % b;
        sb .append(zhengshu);
        if (yushu== 0) {
            return sb.toString() ;
        }
        sb.append(".");
        m.put(  yushu ,  sb.length());
        boolean tianling = true;
        while( yushu != 0 ){

            if(yushu < b){
                yushu = yushu * 10;
                if(!tianling){
                    if( m.containsKey(yushu)){  //循环了
                        break;
                    }
                    sb .append("0");
                    m.put(  yushu , sb.length() );
                }
                tianling= false;
            }
            tianling =true;

            zhengshu = yushu / b;
            sb.append(zhengshu);
            yushu = yushu % b ;

            if( m.containsKey(yushu)){  //循环了
                break;
            }

            m.put(  yushu , sb.length() );

        }
        if( yushu == 0){
            return sb.toString();
        }
        return sb.insert(m.get(yushu).intValue(), '(').append(')').toString();
    }
}
