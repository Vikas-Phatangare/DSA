//package 2Darray;
import java.util.Scanner;

public class spiral {
    public static void printSpiral(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom
            for(int i=endCol-1; i>=0; i--){
                System.out.print(matrix[endRow][i]+" ");
            }
            //left
            for(int j=endRow-1; j>0; j--){
                System.out.print(matrix[j][startCol]+" ");
            }
            break;
        }
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int n=matrix.length,m=matrix[0].length;
         Scanner sc=new Scanner(System.in);
         for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j]=sc.nextInt();
            }
            //System.out.println();
         }
         for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
        printSpiral(matrix);



    }
    

    
}
