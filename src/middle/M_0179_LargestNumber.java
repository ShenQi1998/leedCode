package middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


//方法一：数学计算法：
//比如：int x = 12; int y = 345
//x 拼接 y = 12345 = 12 * 1000 + 345 = x * 1000 + y;
//y 拼接 x = 34512 = 345 * 100 + 12 = y * 100 + x;
//上面的1000是哪里来的？因为y是3位数。上面的100是哪里来的？因为x是2位数；明白这个思想就能写出代码了
//
//方法二：String
//比如：String x = "12"; String y = "345";
//x 拼接 y = "12345" = x + y;
//y 拼接 x = "34512" = y + x;
//因为数字在ASCII码表中是有顺序的，所以利用String的compareTo()方法，可以进行自然顺序的排序。



public class M_0179_LargestNumber {

    public static void main(String[] args) {
//        int[] a = new int[]{34323,3432};
        int[] a = new int[]{3,30,34,5,9};

        System.out.println(largestNumber(a));

    }

    public static String largestNumber(int[] nums) {

        String[] a = new String[nums.length];

        for(int i =0 ; i < nums.length ; i++){
            a[i] = nums[i] + "";
        }

        Arrays.sort(a, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2)
            {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        StringBuilder stringBuilder = new StringBuilder();
        for (String s : a) {
            stringBuilder.append(s);
        }

        if(a[0].equals("0")){
            return "0";
        }
        return stringBuilder.toString();

    }

}
