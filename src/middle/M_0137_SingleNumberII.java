package middle;

public class M_0137_SingleNumberII {

    public static int singleNumber(int[] nums) {
        //最终的结果值
        int res = 0 ;
        for(int i = 0 ; i < 32 ; i ++){
            int sum = 0 ;
            for (int j = 0 ; j < nums.length ; j++){
                String a = Integer.toBinaryString(( nums[j] >> i  ) & 1 );
                System.out.print( a );
                sum = sum + (( nums[j] >> i  ) & 1 );
//                System.out.print(" " +  sum );
            }
            System.out.println();

            if(sum % 3 != 0 ){
                res = res | (1 << i);
            }

        }
        return res ;
    }

    public static void main(String[] args) {
        singleNumber( new int[]{2,2,2,3});
    }

//           0 0 1 0
//           0 0 1 0
//           0 0 1 0
//           0 0 1 1
//  求和     ——————————
//           0 0 4 1
//  对3取余  ——————————
//           0 0 1 1
}
