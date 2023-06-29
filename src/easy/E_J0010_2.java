package easy;

public class E_J0010_2 {


    public static  int numWays(int n) {

        int bebe =  1 ;
        int be = 2 ;
        int sum = 0  ;

        for(int i = 3 ; i <= n ; i ++){
            sum = (bebe + be) % 1000000007 ;
            bebe = be ;
            be = sum ;
        }

        if(n == 0 )
            return 1;
        if(n ==1 || n==2){
            return n;
        }

        return sum;

    }
}
