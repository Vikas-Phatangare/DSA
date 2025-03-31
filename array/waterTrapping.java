//import java.util.*;
public class waterTrapping {
    public static int trapRainWater(int height[]){
        int n= height.length;
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1; i<n; i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        int watertrapped=0;
        for(int i=0; i<n; i++){
            int waterlevel=Math.min(leftMax[i],rightMax[i]);
            watertrapped += waterlevel-height[i];
        }
        return watertrapped;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        int x= trapRainWater(height);
        System.out.println("The water trapped is:"+ x);
    }   
}
