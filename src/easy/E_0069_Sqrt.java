package easy;

//二分查找
public class E_0069_Sqrt {

    public static void main(String[] args) {
        int a = mySqrt(2147395599);
        System.out.println(a);
    }

    public static int mySqrt(int x) {
        if(x == 0){
            return 0 ;
        }
        if(x < 4){
            return 1;
        }
         return handle (x , 0 , x/2);

    }

    public static int handle ( int x , int left , int right ){
        int mid = (left + right) /2 ;
        if( (long)mid * mid <= x && (long)(mid + 1) * (mid + 1) >x){
           return  mid;
        }

        if( (long)mid * mid > x){
            return handle( x ,left , mid - 1);
        }else{
            return handle( x ,mid + 1 , right);
        }

    }
}
