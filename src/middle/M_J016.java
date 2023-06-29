package middle;

public class M_J016 {
    public double myPow(double x, int n1) {

        if( n1 == 1){
            return x;
        }
        if( n1 == 0 ){
            return 1 ;
        }

        double n = n1;
        if( n < 0 ){
            x =1 /x;
            n = - n ;
        }

        int halfN = (int) (n /2);
        double halfPow = myPow(x , halfN);
        halfPow =halfPow * halfPow ;
        if( n%2 == 0){
            return halfPow ;
        }else{
            return halfPow * x ;
        }


    }
}
