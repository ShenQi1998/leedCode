package twoPoint;

public class E_1768_MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        int first = 0 ;
        int second = 0 ;

        StringBuilder sb =  new StringBuilder();
        while ( first < word1.length() || second < word2.length() ){
            if( first < word1.length() ) {
                sb.append( word1.substring(first , first +1)  );
                first ++ ;
            }

            if( second < word2.length() ) {
                sb.append( word2.substring(second , second +1)  );
                second ++ ;
            }

        }
        return sb.toString();

    }

    public static void main(String[] args) {
        mergeAlternately( "1234" , "ab");
    }
}
