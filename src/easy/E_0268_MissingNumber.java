package easy;

import java.util.Arrays;

public class E_0268_MissingNumber {

    public int missingNumber(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0 ; i < nums.length ; i++){

            if(nums[i] !=i ){
                return i;
            }

        }

        return nums.length ;

    }
}
