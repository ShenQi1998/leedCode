package middle;

//无意义的题目
public class M_0151_ReverseWordsInAString {

    public static void main(String[] args) {
        String a = reverseWords("  hello world  ");
        System.out.println( a);
    }
    public static String reverseWords(String s) {
        String[] a =  s.split(" ");
        StringBuilder sb = new StringBuilder();
        for( int i = a.length -1 ; i >=0 ; i--){

            if(  !"".equals(a[i])){
                sb.append( a[i] + " ");
            }
        }
        String result = sb.toString();
        return result.substring(0 , result.length() - 1);
    }
}
