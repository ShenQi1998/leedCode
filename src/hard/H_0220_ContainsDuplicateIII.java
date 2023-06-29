package hard;

public class H_0220_ContainsDuplicateIII {

    public static void main(String[] args) {
        boolean a = containsNearbyAlmostDuplicate( new int[]{1,5,9,1,5 ,9 } , 2, 3);
        System.out.println( a);
    }
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {

        for( int i = 0 ; i < nums.length -1   ; i ++ ){
            for( int j = 1 ; j + i < nums.length && j <= indexDiff  ; j ++){
                System.out.println( i + " - " + ( i + j));

                if(Math.abs( nums[ i + j ] - nums[i] ) <=  valueDiff ){
                    return true;
                }
            }
        }
        return false;
    }
}
