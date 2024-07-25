package arraysss;
import java.util.*;

public class printDiagonal {
    /*Write a function to print diagonals of a given matrix  */
    public static void prinDiagonal(int A[][],int i,int j) {
        int N=A.length;
        int M=A[0].length;
       while(i<N && j<M) {
            System.out.print(A[i][j]+" ");
            i++;
            j++;

       }

    }
    public static void printAllDiagonals(int A[][]) {
        for(int i=A.length-1;i>=0;i--) {
            prinDiagonal(A, i, 0);
        }
        for(int j=1;j<A[0].length;j++) {
            prinDiagonal(A,0, j);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[][]=new int [3][3];
        for(int i=0;i<A.length;i++) {
            for(int j=0;j<A[0].length;j++) {
                A[i][j]=sc.nextInt();

            }
        }
        printAllDiagonals(A);
        sc.close();
    }
    
}
