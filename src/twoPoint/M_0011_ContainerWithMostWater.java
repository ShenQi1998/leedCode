package twoPoint;

public class M_0011_ContainerWithMostWater {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0 ;
        while(left < right){

            if ( (right - left)  * Math.min(height[left] ,height[right] ) > max ){
                max =  (right - left)  * Math.min(height[left] ,height[right] );
            }
            if(height[left] < height[right])    {
                left ++;
            }else{
                right --;
            }
        }

        return  max ;
    }

}
