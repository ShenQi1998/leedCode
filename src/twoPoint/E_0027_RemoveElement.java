package twoPoint;

public class E_0027_RemoveElement {

    public int removeElement(int[] nums, int val) {

        int nowIndex = 0 ;

        for (int i = 0 ; i < nums.length ; i ++){
            if( nums[i] != val ){
                nums[nowIndex] = nums[i];
                nowIndex ++ ;
            }

        }

        return  nowIndex;
    }
}
