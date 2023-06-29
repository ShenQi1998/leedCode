package middle;

//无意义的题目
public class M_0050_Pow {
    public static void main(String[] args) {
        double a = myPow ( 2 , 10 );
        System.out.println(a);
    }

    public static double myPow(double x, int n1) {

        double n = n1;

        if ( n == 0){
            return 1 ;
        } else if( n  == 1 ){
            return x;
        }else if(n < 0){
            x = 1 /x;
            n = -n ;
        }

        int a = (int) (n /2);
        double halfPow = myPow(x , a);
        if( n % 2 != 0 ){
            return  halfPow * halfPow * x;
        }else{
            return  halfPow * halfPow ;
        }
    }
}
