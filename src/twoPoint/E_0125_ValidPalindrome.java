package twoPoint;

public class E_0125_ValidPalindrome {
    public static boolean isPalindrome(String s) {

        int left = 0 ;
        int right = s.length() - 1 ;

        while ( left <= right){
            int leftASC =  (int)s.charAt(left);
            int rightASC =  (int)s.charAt(right);

            if(65 <= leftASC &&  leftASC<= 65 + 25){
                leftASC = leftASC + 32;
            }

            if(65 <= rightASC &&  rightASC<= 65 + 25){
                rightASC = rightASC + 32;
            }

            if(  !(97 <= leftASC && leftASC <= 97 + 25 || 48 <= leftASC && leftASC <= 48 + 9) ){
                left ++ ;
                continue;
            }

            if(  !(97 <= rightASC && rightASC <= 97 + 25 || 48 <= rightASC && rightASC <= 48 + 9) ){
                right -- ;
                continue;
            }

            if( leftASC != rightASC ){
                return  false;
            }

            left ++;
            right -- ;

        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(" "));

    }
}
