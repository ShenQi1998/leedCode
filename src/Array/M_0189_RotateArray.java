package Array;

public class M_0189_RotateArray {

    public static void rotate(int[] nums, int k) {

        if( k == 0 || nums.length == 1 || k ==nums.length  ){
            return;
        }

        int time = 1 ;
        int start = 0 ;
        int index = k ;
        int last = nums[0] ;

        while( time <= nums.length ){

            while( index >= nums.length  ) {
                index = index - nums.length;
            }

            int temp = nums[ index  ] ;
            nums[ index  ] = last ;

            if (index == start ){
                start = start + 1 ;
                index = start + k ;
                last = nums[start];
            }else{
                last = temp;
                index = index  +  k ;
            }
            time ++ ;
        }


        for (int num : nums) {
            System.out.print(num);
        }
    }

    public static void main(String[] args) {
        rotate( new int[  ] {1 ,2 }, 3 );
    }

//    1 2 3 4 5 6 7 8 9
//    7 8 9 1 2 3 4 5 6
}
