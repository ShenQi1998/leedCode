package middle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class M_0187_RepeatedDNASequences {

//    public List<String> findRepeatedDnaSequences(String s) {
//
//        HashSet<String> set = new HashSet<>();
//
//        for( int i = 0 ; i< s.length() - 10 ; i ++ ){
//            for( int j = i + 1 ; j< s.length() - 9 ; j++ ){
//                if( s.substring( i , i + 10 ) .equals( s.substring(j, j +10) ) ){
//                    set.add( s.substring( i , i + 10 ));
//                    break;
//                }
//            }
//
//        }
//
//        ArrayList<String> list = new ArrayList<>();
//        for (String s1 : set) {
//            list.add(s1);
//        }
//        return list;
//    }

    public List<String> findRepeatedDnaSequences(String s) {

        HashMap<String, Integer> m = new HashMap<>();

        for( int i = 0 ; i< s.length() - 9 ; i ++ ){
            String now = s.substring( i , i + 10 );
            if( !m.containsKey(now) ){
                m.put(now , 1);
            }else{
                if( m.get(now) != 0 ){
                    m.put( now , 0  );
                }
            }
        }

        ArrayList<String> list = new ArrayList<>();

        for (String s1 : m.keySet()) {
            if( m.get(s1) == 0){
                list.add(s1);
            }
        }

        return list;
    }

}
