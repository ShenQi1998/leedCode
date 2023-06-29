package String;

import java.util.HashMap;

public class E_0383_RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> m = new HashMap<>();
        for ( int i = 0 ; i < magazine.length() ; i ++ ){
            char now = magazine.charAt(i);
            if( m.containsKey(now) ){
                m.put( now , m.get(now) + 1 );
            }else{
                m.put( now , 1 );
            }
        }

        for ( int j = 0 ; j < ransomNote.length() ; j ++ ){
            char now = ransomNote.charAt(j);
            if( !m.containsKey(now) ||  m.get(now) == 0){
                return false;
            }else{
                m.put( now , m.get(now) -  1 );
            }
        }

        return true;

    }
}
