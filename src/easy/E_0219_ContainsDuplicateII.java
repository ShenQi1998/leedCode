package easy;

public class E_0219_ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i = 0; i < nums.length - 1 ; i ++){
            for( int j = 1 ; j<= k && i + j< nums.length ; j ++ ){
                if( nums[i] == nums[i + j] ){
                    return true;
                }
            }
        }
        return false;
    }
}
