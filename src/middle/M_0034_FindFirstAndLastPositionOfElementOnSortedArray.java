package middle;

//二分查找 同33题
public class M_0034_FindFirstAndLastPositionOfElementOnSortedArray {

    public static void main(String[] args) {
        searchRange( new int[]{5,7,7,8,8,10} , 8 );
    }

    public static int[] searchRange(int[] nums, int target) {
        if(nums.length == 0){
            return  new int[]{-1, -1 };
        }
        int left = 0 ,right = nums.length - 1 ;
        int mid = (left + right ) / 2;
        boolean flag =true;

        while (nums[mid] != target ){
            if( right - left <= 2 ){
                if(nums[left] == target ){
                    mid = left ;
                }else if(nums[right] == target){
                    mid =right;
                }else{
                    flag = false;
                }
                break;
            }

            if(target < nums[mid] ){ //向左查找
                right = mid - 1;
            }else{
                left = mid + 1;
            }
            mid = (right + left) / 2 ;
        }


        System.out.println(mid);
        if(! flag){
            return  new int[]{-1, -1 };
        }else{
            int leftmid = mid , rightmid = mid;
            while( leftmid!= 0 && nums[leftmid - 1] == target ){
                leftmid -- ;
            }
            while( rightmid != nums.length - 1  && nums[rightmid + 1] == target){
                rightmid ++ ;
            }

            return new int[]{leftmid , rightmid};
        }
    }
}
