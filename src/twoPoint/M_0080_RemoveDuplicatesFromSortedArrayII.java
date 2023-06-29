package twoPoint;

public class M_0080_RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {


//        int count = 0 ;
//        int last = Integer.MAX_VALUE;
//        int index = 0 ;
//        for (int i =  ; i < nums.length ; i ++){
//
//            if( nums[i] != last ){
//                nums[index] = nums[i];
//                index ++ ;
//                last = nums[i];
//                count = 1 ;
//            } else if( count == 1){
//                nums[index] = nums[i];
//                index ++ ;
//                last = nums[i];
//                count ++ ;
//            }
//
//        }


        int index = 2 ;

        for (int i = 2 ; i < nums.length ; i ++){
            if(  nums[i] != nums[index-2] ){
                nums[index] = nums[i];
                index ++ ;
            }

        }

        return index;
    }
}
