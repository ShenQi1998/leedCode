package middle;

//无意义的题目
public class M_0028_FindTheIndexOfTheFirstOccurrenceInAString {

    public int strStr(String haystack, String needle) {
        for( int i = 0 ; i <= haystack.length() - needle.length() ; i ++){
            if( haystack.substring( i , i +  needle.length()).equals(needle) ){
                return  i ;
            }
        }

        return -1 ;
    }
}
