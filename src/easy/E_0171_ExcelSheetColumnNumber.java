package easy;

public class E_0171_ExcelSheetColumnNumber {
    public static void main(String[] args) {
        titleToNumber("AB" ) ;
    }

    public static int titleToNumber(String columnTitle) {
        int sum = 0 ;
        char[] chars = columnTitle.toCharArray();
        for( int i = columnTitle.length() - 1 ; i >=0 ; i--){
            int x =(int)chars[ columnTitle.length() - 1 - i] - 64 ;
            System.out.println( x);
            sum = (int) (sum + x * Math.pow(26 , i));
        }

        System.out.println(sum);
        return sum;

    }
}
