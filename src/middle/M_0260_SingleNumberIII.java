package middle;

public class M_0260_SingleNumberIII {
    public static int[] singleNumber(int[] nums) {
        int xorsum = 0;
        for (int num : nums) {
            xorsum ^= num;
        }
        // 防止溢出
        System.out.println(xorsum);
        int lsb = (xorsum == Integer.MIN_VALUE ? xorsum : xorsum & (-xorsum));
        System.out.println(lsb);

        int type1 = 0, type2 = 0;
        for (int num : nums) {
            if ((num & lsb) != 0) {
                type1 ^= num;
            } else {
                type2 ^= num;
            }
        }
        return new int[]{type1, type2};


    }

    public static void main(String[] args) {
        singleNumber(new int[]{1,2,1,3,2,5});
    }
}
