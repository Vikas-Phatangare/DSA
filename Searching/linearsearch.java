//package Searching;

public class linearsearch {
    public static int findindex(int number[], int key){
        for(int i=0; i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14,16};
        int key=11;
        int index=findindex(number,key);
         System.out.println(index);
    }
    
}
