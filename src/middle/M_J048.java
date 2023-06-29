package middle;

public class M_J048 {
    public static void main(String[] args) {
        int a = lengthOfLongestSubstring("abcabcc");
        System.out.println(a);
    }

    public static int lengthOfLongestSubstring(String s) {
        String str = "";
        int left = 0 ;
        int max = 0 ;
        for( int right = 0 ; right < s.length()  ; right ++){
            String now = s.substring(right , right + 1 );
            if( str.indexOf( now ) != -1 ){
                left = left + str.indexOf( now ) + 1   ;
            }
            str= s.substring(left , right + 1);
            max = Math.max( max , right - left + 1 );
        }
        return  max ;
    }
}
