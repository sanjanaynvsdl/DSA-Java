package arraysss;


import java.util.*;
public class array2D {

    /*2D array is array of arrays  (2D array -1 /18-08-2023)
     * datat type [][]arrayname = new data type[][]
     * i = size = A.length ; j = A[0].length
     * it is in the form of matrix
     * int max = Integer.MIN_VALUE to intialize max 
     */


/*     public static void main (String args[]) {
        
        /* 
        /*2D array prints a matrix of rows and columns  
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [][] A = new int [N][M]; //syntx for 2D
        for(int i=0;i<A.length;i++) {
            for(int j=0;j<A[0].length;j++) {  //input of row and column(0,1)==>i,j
                A[i][j]=sc.nextInt();
            }
        }
        for(int i =0;i<A.length;i++) {
            for(int j=0;j<A[0].length;j++) {
                System.out.print(A[i][j]+" "); //row matrix is printed 
            }
        }
    }
    */

    /* print diagonal of a matrix */

    public static void printdiagonal(int[][]A ) {

        for(int i=0;i<A.length;i++) {
            for(int j=0;j<A[0].length;j++) {
                if( i==j) {
                    System.out.print(A[i][j]+" ");
                }
            }
        }
    }
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [][] A = new int [N] [N];
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
               A[i][j] = sc.nextInt();
            }
        }
         printdiagonal(A);
        
         sc.close();
    }
    
/*     public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A [][] = new int [N][N];
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                A[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                if(i==j) {
                    System.out.print(A[i][j]+" ");
                }
            }
        }
    }
 */

    /*2. print diagonal elements from right side  ?? */
    
    /* 3.transpose of a matrix without using another matrix */
     /*public static void transpose(int [][]A) {
        for(int i=0;i<A.length;i++) {
            for(int j=i+1;j<A.length;j++) {
                int temp=A[i][j];
                A[i][j]=A[j][i];
                A[j][i]=temp;
            }
        }

    }
    */

    


}
