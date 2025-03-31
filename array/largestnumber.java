//package array;
public class largestnumber {
    public static int largenumber(int num[]){
        int lar=Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            if(num[i]>lar){
                lar=num[i];
            }
        }
        return lar;
    }
    public static void main(String[] args) {
        int num[]={2,6,4,5,9,1,3};
        int x= largenumber(num);

        System.out.println("The largest number is "+ x);

    }
    
}
