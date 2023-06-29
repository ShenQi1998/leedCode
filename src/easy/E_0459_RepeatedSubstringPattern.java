package easy;

//无需重做
public class E_0459_RepeatedSubstringPattern {

    public static void main(String[] args) {
        repeatedSubstringPattern("abaabaaba");
    }
    public static boolean repeatedSubstringPattern(String s) {

        for( int i = 1 ; i <= s.length() /2   ; i ++){
            if( s.length() % i  == 0){
                String now  = s.substring(0 , i );
                for( int j = i ; j < s.length() ;){
                    if( ! s.substring( j , j + now.length() ) .equals(now ) ){
                        break;
                    }
                    if( j == s.length() - now.length()){
                        return true;
                    }
                    j = j + now.length();
                }
            }
        }
        return false;
    }
}
