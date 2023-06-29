package easy;

public class E_0405_ConvertANumberToHexadecimal {
    public static String toHex(int num) {

        //26 / 16 = 1  ..... 10
        StringBuilder sb = new StringBuilder();
        while( num / 16 > 0 ){
            int yushu  = num % 16 ;

            sb.append( to16String(yushu ) );
            num = num / 16;

        }

        sb.append( to16String(num ) );
        sb.reverse();
        System.out.println(sb.toString());
        return sb.toString();

    }

    private static String to16String(int num ){
        char n = '0' ;
        if ( num > 9 ){
            n = (char) (num - 10  + 'a');
        }else{
            n = (char) (num + '0');
        }

        String res = String.valueOf(n);
        return res;
    }

    public static void main(String[] args) {
        toHex(123);
    }
}
