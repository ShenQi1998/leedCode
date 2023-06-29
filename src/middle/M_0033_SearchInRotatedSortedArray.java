package middle;

//二分查找
//4 5 6 7 0 1 2  -> 0
//第一次  左: 4 5 6 右： 0 1 2  选右面
//第二次  左：0 右：2   选左面
//第三次  找到下标

//题目较难 ： 使用二分查找

public class M_0033_SearchInRotatedSortedArray {

    public static void main(String[] args) {
        int a = 0 ;
//        a=search( new int[]{ 1 , 2 ,3 , 4, 5} , 4);
//        System.out.println(a);
//        a = search( new int[]{  2 ,3 , 4, 5 , 1} , 4);
//        System.out.println(a);
//        a = search( new int[]{  3 , 4, 5 , 1 , 2} , 4);
//        System.out.println(a);
//        a = search( new int[]{  4, 5 , 1 , 2 , 3} , 4);
//        System.out.println(a);
//        a = search( new int[]{  5 , 1 , 2 , 3 , 4} , 4);
//        System.out.println(a);
//        a = search( new int[]{ 1 , 2 ,3 , 4, 5} , -1);
//        System.out.println(a);
//        a = search( new int[]{ 1 , 2 ,3 , 4, 5} , 6);
//        System.out.println(a);
//        a = search( new int[]{ 1 ,3 } , 2);
//        System.out.println(a);


        a = search( new int[]{ 2,3,4,5,6,7,8,9,1} , 9);
        System.out.println(a);
    }

    public static int search(int[] nums, int target) {
        boolean flag = true;
        int left = 0;
        int right = nums.length - 1 ;
        int mid = (left + right) / 2;
        while(nums[mid] !=  target){

            if( right - left <= 1){
                if(nums[left] == target){
                    mid = left;
                }else if( nums[right] == target){
                    mid = right;
                }else{
                    flag =false;
                }
                break;
            }

            if( nums [left] <  nums[mid ]  ){  //左面是正序
                if( nums[left]  <= target &&  target <= nums[mid - 1] ){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{              //右面是正序  45123
                if( nums[mid +1 ] <=  target && target <= nums[right]){  //在右伴部分
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
            mid = (left + right) / 2;
        }

        if(flag) {
            return mid;
        }else{
            return -1 ;
        }
    }
}
