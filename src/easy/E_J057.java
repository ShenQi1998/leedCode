package easy;

public class E_J057 {

    public static void main(String[] args) {
        twoSum( new int[]{ 2,7,11,15 } , 9);
    }

    public static int[] twoSum(int[] nums, int target) {

        int left = 0 ;
        int right = nums.length - 1 ;
        int[] result = new int[2] ;

        while(left < right ){
            if(nums[left] + nums[right] == target){
                result[0] = nums[left];
                result[1] = nums[right];
                System.out.println(left + " - " + right);
                return result;
            }else if(nums[left] + nums[right] < target){
                left ++ ;
            }else {
                right -- ;
            }
        }
        return result;
    }

    //暴力破解
//    public int[] twoSum(int[] nums, int target) {
//        int[] result = new int[2] ;
//        for( int i = 0 ; i < nums.length ; i ++ ){
//            for( int j = 0 ; j < nums.length ; j++){
//                if( i != j && nums[i] + nums[j] == target){
//                    result[0] = nums[i];
//                    result[1] = nums[j];
//                    return result;
//                }
//            }
//        }
//        return result;
//    }
}
