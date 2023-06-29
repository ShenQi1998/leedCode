package easy;

import java.util.Arrays;

public class E_0136_SingleNumber {

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        boolean first = true;
        int num = 0 ;
        for( int i = 0 ; i < nums.length - 1 ; i++ ){
            if(first){
               num = nums[i];
               first = false;
            }else{
                if( num != nums[i] ){
                    return num;
                }
                first = true;
            }
        }

        return nums[nums.length - 1 ] ;


//        异或运算
//        int single = 0;
//        for (int num : nums) {
//            single = single^num;
//        }
//        return single;
    }
}
