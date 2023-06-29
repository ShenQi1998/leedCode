package hard;

public class H_0004_MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        double a = findMedianSortedArrays( new int[]{ 1 ,4 } , new int[]{2 , 3});
//        double a = findMedianSortedArrays( new int[]{1 ,2} , new int[]{3,4});
        System.out.println( a);



    }

    //时间复杂度log((m+n)/2 ) 不符合要求
//    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//
//        if(nums1.length == 0){
//            return getMid(nums2 , 0 , nums2.length - 1);
//        }
//
//        if(nums2.length == 0){
//            return getMid(nums1 , 0 , nums1.length - 1);
//        }
//
//        int left1 = 0 , right1 = nums1.length - 1;
//        int left2 = 0 , right2 = nums2.length - 1;
//        int leftLast = 0 , rightLast = 0 ;
//        while (left1 <= right1 && left2 <=  right2){
//
//            if( nums1[left1] < nums2[left2] ){
//                leftLast = nums1[left1];
//                left1 ++ ;
//            }else{
//                leftLast = nums2[left2];
//                left2 ++ ;
//            }
//
//            if( nums1[right1] > nums2[right2] ){
//                rightLast = nums1[right1];
//                right1 -- ;
//            }else{
//                rightLast = nums2[right2] ;
//                right2 -- ;
//            }
//        }
//
//        //情况1.两个正好全部消掉
//        if( left1 > right1 && left2  >  right2 ){
//            System.out.println(leftLast + " " + rightLast);
//            return (  (leftLast + rightLast) / 2.0 );
//        } else if( left2 > right2 ){ //情况2.数组1剩余
//            return getMid(nums1 ,left1 , right1 );
//        }else{  //情况3.数组2剩余
//            return getMid(nums2 ,left2 , right2 );
//        }
//
//    }
//
//    public  static  double getMid (int[] nums , int start , int end){
//        if( (end - start) % 2 == 0){
//            return nums[ start + ( (end - start) / 2) ];
//        }else{
//            int a = start + ( (end - start)  / 2  ) ;
//            return (nums[a] + nums[a+1] )/2.0 ;
//        }
//    }

    // 这道题很难
    //二分查找
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int length1 = nums1.length;
        int length2 = nums2.length;

        boolean jiFlag = (length1 + length2) % 2 != 0 ? true : false;

        int mid1 = length1 % 2 == 0 ?length1 / 2 - 1 : length1 / 2  ;
        int mid2 =  (length1 + length2) /2  - mid1 - 2;
        if(jiFlag){
            mid2 ++ ;
        }

        while( true ){
            if ( (mid1 >= 0 && mid2  < length2 - 1)  &&  nums1[mid1] > nums2[mid2 + 1]) {
                mid1--;mid2++;
            } else if (  (  mid2 >= 0 && mid1  < length1 - 1  ) &&  nums1[mid1 + 1] < nums2[mid2]) {
                mid1++; mid2--;
            }else{
                break;
            }
        }

        int left1 = mid1== -1 ? Integer.MIN_VALUE : nums1[mid1];
        int left2 = mid2== -1 ? Integer.MIN_VALUE : nums2[mid2];
        if(jiFlag){
            return Math.max(left1 , left2);
        }else{
            int right1 = mid1 ==  length1- 1 ? Integer.MAX_VALUE : nums1[mid1 + 1];
            int right2 = mid2 ==  length2- 1 ? Integer.MAX_VALUE : nums2[mid2 + 1];
            return (Math.max(left1, left2) + Math.min(right1 , right2)) / 2.0;
        }

    }


}
