package middle;

//P     I    N
//A   L S  I G
//Y A   H R
//P     I




//P   A   H   N
//A P L S I I
//Y   I   R


//数学公式问题

public class M_0006_ZigzagConversion {
    public static void main(String[] args) {
        convert("ABC" , 3);
    }

    public static String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        StringBuilder sb= new StringBuilder();
        int every = (numRows * 2 ) -2;
        int zushu = s.length() / every + 1 ;
        for(int  i = 0 ; i< numRows ; i++){
            for( int j = 0 ; j < zushu ; j ++ ){
                int nowIndex = j * every + i ;
//                System.out.println(  nowIndex );
                if(  nowIndex > s.length() - 1 ){
                    continue;
                }

                if( i == 0 || i==  numRows - 1){
                    sb.append( s.substring(  nowIndex ,  nowIndex + 1 )  ) ;
                }else{
                    if( i < numRows - 1 ){
                        int secondIndex = j * every + (every - i );
                        sb.append( s.substring(  nowIndex ,  nowIndex + 1 )  ) ;
                        if( secondIndex <= s.length() -1 ){
                            sb.append( s.substring(  secondIndex ,  secondIndex + 1 )  ) ;
                        }
                    }
                }

            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

//    public static String convert(String s, int numRows) {
//        if(numRows == 1){
//            return s;
//        }
//        StringBuilder sb= new StringBuilder();
//        int every = (numRows * 2 ) -2;
//        int zushu = s.length() / every + 1 ;
//        for(int  i = 0 ; i< every ; i++){
//            for( int j = 0 ; j < zushu ; j ++ ){
//                int nowIndex = j * every + i ;
////                System.out.println(  nowIndex );
//                if(  nowIndex > s.length() - 1 ){
//                    continue;
//                }
//
//                if( i == 0 || i==  numRows - 1){
//                    sb.append( s.substring(  nowIndex ,  nowIndex + 1 )  ) ;
//                }else{
//                    if( i < numRows - 1 ){
//                        int secondIndex = j * every + (every - i );
//                        sb.append( s.substring(  nowIndex ,  nowIndex + 1 )  ) ;
//                        if( secondIndex <= s.length() -1 ){
//                            sb.append( s.substring(  secondIndex ,  secondIndex + 1 )  ) ;
//                        }
//                    }
//                }
//
//            }
//        }
//        System.out.println(sb.toString());
//        return sb.toString();
//    }


}
