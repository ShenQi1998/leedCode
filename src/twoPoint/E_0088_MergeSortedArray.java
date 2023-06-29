package twoPoint;

import java.util.Arrays;

public class E_0088_MergeSortedArray {


    public static void merge(int[] nums1, int m, int[] nums2, int n) {


        for ( int i = 0 ; i < nums1.length - m  ; i ++){
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);


        for ( int i = 0 ; i < nums1.length ; i ++){
            System.out.print( nums1[i] + " " );
        }
    }

    public static void main(String[] args) {
//        merge( new int[]{1} , 1 , new int[]{} , 0);
        //merge( new int[]{0} , 0 , new int[]{1} , 1);
      //  merge( new int[]{1,2,3,0,0,0} , 3 , new int[]{2,5,6} , 3);
        merge( new int[]{-1,0,0,3,3,3,0,0,0} , 6 , new int[]{1,2,2} , 3);



    }
}
