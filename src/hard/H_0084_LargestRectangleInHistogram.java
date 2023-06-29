package hard;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class H_0084_LargestRectangleInHistogram {

    public static void main(String[] args) {
        largestRectangleArea( new int[]{2,1,5,6,2,3} );
    }


    //暴力破解，超时
//    public static int largestRectangleArea(int[] heights) {
//        int max = 0 ;
//        for( int i = 0 ; i < heights.length ; i ++ ){
//            int high = heights[i];
//            int left = i ;
//            int right = i ;
//            while( left > 0  && heights[left-1] >= high || right < heights.length - 1   && heights[right+1] >= high){
//                if(left > 0  && heights[left - 1] >= high){
//                    left -- ;
//                }
//                if( right < heights.length - 1   && heights[right+1] >= high ){
//                    right ++ ;
//                }
//            }
//            System.out.println(  (right - left + 1) * high  );
//            max = Math.max( max , (right - left +1 ) * high );
//        }
//        return  max ;
//    }

    public static int largestRectangleArea(int[] heights) {

        // 这里为了代码简便，在柱体数组的头和尾加了两个高度为 0 的柱体。
        int[] tmp = new int[heights.length + 2];
        System.arraycopy(heights, 0, tmp, 1, heights.length);

        Deque<Integer> stack = new ArrayDeque<>();
        int area = 0;
        for (int i = 0; i < tmp.length; i++) {
            // 对栈中柱体来说，栈中的下一个柱体就是其「左边第一个小于自身的柱体」；
            // 若当前柱体 i 的高度小于栈顶柱体的高度，说明 i 是栈顶柱体的「右边第一个小于栈顶柱体的柱体」。
            // 因此以栈顶柱体为高的矩形的左右宽度边界就确定了，可以计算面积🌶️ ～
            while (!stack.isEmpty() && tmp[i] < tmp[stack.peek()]) {
                int h = tmp[stack.pop()];
                area = Math.max(area, (i - stack.peek() - 1) * h);
            }
            stack.push(i);
        }

        return area;
    }
}
