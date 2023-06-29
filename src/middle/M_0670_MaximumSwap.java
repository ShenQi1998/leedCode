package middle;

public class M_0670_MaximumSwap {

    public static void main(String[] args) {
        int a = maximumSwap(98368);
        System.out.println(a);
    }

    public static int maximumSwap(int num) {
        String strNum = String.valueOf(num);
        for( int i = 0 ; i < strNum.length() -1 ; i ++){
            int first = Integer.valueOf(strNum.substring(i , i + 1));
            int max_index = i ;
            int max = first ;
            for( int j = i + 1 ; j < strNum.length()  ; j ++){
                int second = Integer.valueOf(strNum.substring(j , j + 1));
                if(second > first  && second >=  max){
                    max = second ;
                    max_index = j ;
                }
            }

            if( max_index != i) {
                strNum = swap(strNum, i, max_index);
                return Integer.valueOf(strNum);
            }

        }

        return num;

    }

    public static String swap(String s,int a,int b){
        StringBuffer sb = new StringBuffer(s);
        char temp = sb.charAt(a);
        sb.setCharAt(a,sb.charAt(b));
        sb.setCharAt(b,temp);
        return sb.toString();
    }


}
