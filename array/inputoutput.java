//package array;
import java.util.*;
public class inputoutput {
    public static void main(String[] args) {
        int arr[]=new int[50];
        Scanner sc= new Scanner(System.in);

        arr[0]=sc.nextInt();
        arr[1]=sc.nextInt();
        arr[2]=sc.nextInt();
         
        arr[1]=arr[1]+1; 

        System.out.println("  "+arr[0]);
        System.out.println(" "+arr[1]);
        System.out.println(arr[2]);
    }


    
}
