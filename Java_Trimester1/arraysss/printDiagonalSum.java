package arraysss;
import java.util.*;

public class printDiagonalSum {

    public static void printDiagonal(int A[][],int i,int j) {
        int N=A.length;
        // int M=A[0].length;
        while(i<N && j>=0) {
            System.out.print(A[i][j]+" ");
            i++;
            j--;
        }
    }
    public static void printAllDiagonals(int A[][]) {
        for(int j=0;j<A[0].length-1;j++) {
            printDiagonal(A, 0, j);
        }
        for(int i=0;i<A.length;i++) {
            printDiagonal(A, i, A[0].length-1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int A[][]=new int [N][M];
        for(int i=0;i<A.length;i++) {
            for(int j=0;j<A[0].length;j++) {
                A[i][j]=sc.nextInt();
            }
        }
        printAllDiagonals(A);


        sc.close();
    }
    
}
