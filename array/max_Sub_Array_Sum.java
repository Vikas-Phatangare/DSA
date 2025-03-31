public class max_Sub_Array_Sum {
    public static void maxSubarr(int num[]){
        int max_Sum=Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            int curr= num[i];
            for(int j=i+1; j<num.length; j++){

                int temp= curr+num[j];
                System.out.print(temp+" ");
               
                if(max_Sum<temp){
                    max_Sum=temp;
                }
            }System.out.println();
        }
        System.out.println("max sum of subarray is="+ max_Sum);
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        maxSubarr(num);
    }
    
}
