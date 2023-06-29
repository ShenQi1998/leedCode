package math;

// 简单 没有重复做的必要
public class E_0009_PalindromeNumber {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);

        int left = 0 ;
        int right = str.length() - 1 ;
        while( left <= right){
            if( ! str.substring(left , left + 1) .equals( str.substring( right, right + 1) ) ){
                return false;
            }

            left ++ ;
            right -- ;
        }

        return true ;
    }
}
