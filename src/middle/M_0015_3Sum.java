package middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M_0015_3Sum {

    public static void main(String[] args) {
        threeSum( new int[]{-1,0,1,2,-1,-4});
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int left = 0 ;
        int right = nums.length -1 ;

        ArrayList<List<Integer>> result = new ArrayList<>();

        while ( left + 1 < right){
            if( nums[0] + nums[1] + nums[right] < 0  ){
                left ++;
            } else if( nums[0] + nums[1] + nums[right] >0 ){
                right -- ;
            }else{
                ArrayList<Integer> nowResult = new ArrayList<>();
                nowResult .add(nums[0]);
                nowResult.add(nums[1]);
                nowResult.add(nums[right]);
                System.out.println(nums[0] + " "  +  nums[1] + " "  +  nums[right] );
                result .add(nowResult);
            }
        }

        return  result;


    }
}
