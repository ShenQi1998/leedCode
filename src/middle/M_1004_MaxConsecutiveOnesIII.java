package middle;

public class M_1004_MaxConsecutiveOnesIII {

    public static void main(String[] args) {
        int a = longestOnes(new int []{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1} , 3);
        System.out.println( a);
    }

    public  static int longestOnes(int[] nums, int k) {
        int left = 0 ;
        int zeroOne = 0 ;
        int max = 0 ;

        for( int right = 0 ;right < nums.length ; right ++) {
            System.out.println( "left " + left + " right " + right + " 翻转 " + zeroOne );
            if (nums[right] == 0) {
                zeroOne++;
                while (k < zeroOne) {
                    if (nums[left] == 0) {
                        zeroOne--;
                    }
                    left++;
                }
            }
            max = Math.max(max , right - left + 1);
        }

        return max ;
    }
}
