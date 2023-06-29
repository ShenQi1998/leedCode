package easy;

import java.util.Arrays;

public class E_J061 {
    public static void main(String[] args) {
        boolean a = isStraight( new int[]{0,0,2,2,5});
        System.out.println(a);
    }
    public static boolean isStraight(int[] nums) {

        int wang =0 ;
        int before = 0 ;

        Arrays.sort(nums);

        for( int i = 0 ; i < nums.length ; i ++){
            int now = nums[i];
            if( now == 0 ){
                wang ++;
                continue;
            }

            if(now == before){
                return false;
            }

            if(before != 0  && now - before > 1  ){
                wang = wang - (now - before - 1);
                if(wang < 0 )
                    return false;
            }

            before = now ;
        }

        return true ;

    }
}
