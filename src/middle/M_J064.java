package middle;

public class M_J064 {


    public static void main(String[] args) {
        int a = sumNums(3);
        System.out.println( a);
    }

    public static int sumNums(int n) {

//        if(n <= 0){
//            return 0 ;
//        }
//        return n + sumNums(n -1 );

        boolean flag = n > 0 && (n += sumNums(n - 1)) > 0;
        return n;
    }

}
