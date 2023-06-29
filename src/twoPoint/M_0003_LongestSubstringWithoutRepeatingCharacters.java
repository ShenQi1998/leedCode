package twoPoint;

public class M_0003_LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String s = "a";
        lengthOfLongestSubstring(s);
    }


    public static int lengthOfLongestSubstring(String s) {

        int max = 0 ;
        int j = 1 ;

//        if(s.length() == 1 ){
//            return  1 ;
//        }

        for(int i = 0 ; i < s.length() -1 ; i ++){
            for ( ; j < s.length() ; j ++){

                //情况1 :  指到了同一个元素
                if(i == j ){
                    continue; //后指针+1
                }

                //情况2 : 后指针与当前字符重复
                if( s.substring(i , j  ).contains( s.substring( j , j + 1 ) )  ){
                    if ( j - i > max ){
                        max = j -i ;
                    }
                    break; //前指针 +1
                }

                //情况3 ： 不重复
                //不做任何处理 既后指针+1
                //处理最后一位不重复的情况
                if(j == s.length() -1){
                    System.out.println( i + " " + j);
                    if ( j - i + 1 > max ){
                        max = j -i + 1 ;
                    }
                }
            }

        }
        System.out.println(max);
        return max ;
    }
}
