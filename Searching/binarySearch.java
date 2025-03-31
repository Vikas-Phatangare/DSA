//package Searching;

public class binarySearch {
    public static int getkey(int number[],int key){
        int start=0, end=number.length-1;
        while(start<=end){
            int mid=(start+end)/2;

            if(number[mid]==key){
                return mid;
            }
            if(number[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14,16,18};
        int key=14;
         int x=getkey(number,key);
         System.out.println(x);
    }
    
}
