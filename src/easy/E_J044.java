package easy;

import java.util.Arrays;

public class E_J044 {


    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 3, 4};
        getLeastNumbers(arr , 3);
    }


    //自己写的排序法更慢
    public static int[] getLeastNumbers(int[] arr, int k) {
//        Arrays.sort(arr);
        int[] result = new int[k];
        for( int i = 0 ; i < arr.length -1; i ++){
            for (int j = i + 1 ; j < arr.length ; j++){
                if( arr[i] > arr[j] ){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            result[i] = arr[i];
            System.out.println(result[i]);
            if( i == k-1 ){
                return result;
            }
        }

        return result;
    }


//    public int[] getLeastNumbers(int[] arr, int k) {
//        Arrays.sort(arr);
//
//        int[] result = new int[k];
//
//        for(int i= 0 ; i < k ; i++){
//            result[i] = arr[i];
//        }
//        return result;
//
//    }
}
