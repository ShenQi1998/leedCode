package middle;

import java.util.Arrays;
import java.util.Comparator;

public class M_J045 {
    public static void main(String[] args) {
        minNumber( new int[]{  10 , 2});
    }

    public static String minNumber(int[] nums) {

        String[] a = new String[nums.length];

        for(int i =0 ; i < nums.length ; i++){
            a[i] = nums[i] + "";
        }

//        Arrays.sort( a ,new Comparator<String>() {
//                    @Override
//                    public int compare(String o1, String o2) {
//                        if( Integer.valueOf( o1 + o2  ) < Integer.valueOf( o2 + o1  ) )
//                            return -1 ;
//                        return 1;
//                    }
//                }
//        );

        Arrays.sort(a, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2)
            {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String num : a) {
            System.out.println( num);
            sb.append(String.valueOf(num));
        }

        return sb.toString();


    }
}
