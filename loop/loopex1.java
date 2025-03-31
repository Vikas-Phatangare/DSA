//package loop;

import java.util.Scanner;
public class loopex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        int j=0;
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for(i=0;i<=n;i++){
            j=j+i;
        }
        System.out.println(j);

        
    }
    
}
