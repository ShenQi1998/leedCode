package middle;

public class M_J044 {

    public static void main(String[] args) {
        int a = findNthDigit( 11 );
        System.out.println( a );
    }

    public static  int findNthDigit(int n1) {

        double n = n1 ;
        int weishu = 1 ;
        while ( n > weishu * Math.pow ( 10 , weishu )){
            n =  (n  + Math.pow ( 10 , weishu ));
            weishu ++ ;
        }

        int num = (int) (n / weishu);
        int wei = (int) (n % weishu);
        return Integer.valueOf( String.valueOf(num).substring(wei ,wei + 1 ) );
    }

}
