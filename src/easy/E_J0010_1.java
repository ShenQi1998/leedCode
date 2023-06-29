package easy;

public class E_J0010_1 {

    private int beforeBefore = 0 ;
    private int before = 1 ;

    public int fib(int n) {
        if(n == 0){
            return  0 ;
        }

        int now = beforeBefore + before ;
        now = now % 1000000007;
        if(n <= 2 ){
            return now;
        }

        beforeBefore = before ;
        before = now ;

        return fib(n - 1);
    }

}
