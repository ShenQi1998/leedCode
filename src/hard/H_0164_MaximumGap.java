package hard;

import java.util.Arrays;

public class H_0164_MaximumGap {

    public static void main(String[] args) {
        maximumGap( new int[]{1,1,1,5,5,5});
    }

//    public static int maximumGap(int[] nums) {
//
//        int max = 0 ;
//        for( int i= 0 ; i< nums.length ; i++ ){
//
//            int min = Integer.MAX_VALUE;
//            for( int j = 0 ; j <nums.length ; j++ ){
////                if( i == j ){
////                    continue;
////                }
//
//                if( nums[i] < nums[j] && nums[j] - nums[i] < min ){
//                    min =  nums[j] - nums[i];
//                }
//
//            }
//
//            System.out.println(min);
//            if (min !=  Integer.MAX_VALUE && min > max ){
//                max = min;
//            }
//        }
//
//        return max ;
//    }

    public static int maximumGap(int[] nums) {
        //桶排序
        //数组的最大元素为max，最小为min，设最大间距为maxgap
        //易知 max-min<=maxgap*(n-1)
        int n = nums.length;
        if (n < 2)
            return 0;
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();

        //每个桶的大小
        int bucketSize = Math.max(1, (max - min) / (n - 1));
        //桶的数量
        int bucketCount = (max - min) / bucketSize + 1;
        //设置一个数组来保存每一个桶，序号从0开始
        //用2维数组来定义，0代表最小值，1代表最大值
        int[][] buckets = new int[bucketCount][2];
        for (int[] b : buckets) {
            b[0] = Integer.MAX_VALUE;
            b[1] = Integer.MIN_VALUE;
        }
        //遍历nums中的每一个数,给每一个数字一个对应的桶序号，放进数组buckets
        for (int num : nums) {
            //桶序号
            int i = (num - min) / bucketSize;
            //放进桶里
            buckets[i][0] = Math.min(buckets[i][0], num);
            buckets[i][1] = Math.max(buckets[i][1], num);
        }
        //照桶序号遍历buckets，当前桶的最小值与上一桶的最大值时排序后相邻的两数，两者相减
        int pre = Integer.MAX_VALUE;
        int res = 0;
        for (int[] b : buckets) {
            if (b[0] > b[1]) {
                continue;
                //避免序号为0的桶，因为初始化的条件判断出错
            }
            res = Math.max(res, b[0] - pre);
            pre = b[1];
        }
        return res;
    }

}
