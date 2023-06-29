package hard;

import java.lang.reflect.Array;
import java.util.*;

//超时

public class H_0315_CountOfSmallerNumbersAfterSelf {

    public static void main(String[] args) {
        countSmaller(new int[] {5,2,6,1}) ;
    }

    public static List<Integer> countSmaller(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : nums)
            set.add(i);

        int[] m = new int[set.size()];
        int iIndex = 0;
        for (Integer integer : set) {
            m[iIndex] = integer;
            iIndex++;
        }
        int[] m1 = new int[set.size()];


        for(int right = nums.length -1 ; right >=0 ;right --){
            int now = nums[right];
            int sum = 0 ;
            int i = 0 ;
            for( ; i < m.length ; i ++){
                if( now == m[i]){
                    break;
                }
                sum = sum + m1[i];
            }

            m1[i] ++;
            System.out.println(sum);
            list.add( sum);
        }

        Collections.reverse(list);
        return  list;

    }


//    public static List<Integer> countSmaller(int[] nums) {
//        ArrayList<Integer> list = new ArrayList<>();
//        TreeMap<Integer, Integer> m = new TreeMap<>();
//        for (int i : nums) {
//            m.put(i , 0);
//        }
//
//        for(int right = nums.length -1 ; right >=0 ;right --){
//            int now = nums[right];
//            int sum = 0 ;
//            for (Integer key : m.keySet()) {
//                if( key == now){
//                    break;
//                }
//                sum = sum + m.get(key);
//            }
//            m.put( now , m.get(now) + 1 );
//            System.out.println(sum);
//            list.add( sum);
//        }
//
//        Collections.reverse(list);
//        return  list;
//
//    }
}
