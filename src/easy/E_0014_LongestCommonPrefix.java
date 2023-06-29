package easy;

public class E_0014_LongestCommonPrefix {

    public static void main(String[] args) {
        String a = longestCommonPrefix(new String[]{"abc" , "ab"});
        System.out.println( a );
    }

    public static String longestCommonPrefix(String[] strs) {

        if(strs.length == 0 || strs[0].length() == 0){
            return "" ;
        }

        String first = strs[0];
        for(int i = 0 ; i < first.length() ; i ++){
            String nowStr = first.substring(i , i + 1) ;
            for (String s : strs){
                if(s.length() == i ){
                    return first.substring(0 , i );
                }

                if( ! s.substring(i , i + 1).equals(nowStr)){
                    return first.substring(0 , i );
                }
            }
        }

        return first ;

    }

}
