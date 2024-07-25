package Java_Trimester2.BinarySearch;
import java.util.*;

public class class1 {
    //06=11=2023
    //Two pointers
    //Matrix Question
    //Quick sort 

    /*Given a array of size N Re-arrange the array such that the last element of the
     array reaches its correct position in sorted order and
     all elements <= last element --> on left side 
     all elemend >=last elements  --> right side 
     
     */
    //TWo pointers
    /*public static void rearrange(int A[]) {
        int lastELe =A[A.length-1];
        int j=0;
        for(int i=0;i<A.length-1;i++) {
            if(A[i]<=lastELe) {
                //can also use swap function.
                int temp=A[i];
                A[i]=A[j];
                A[j]=temp;
                j++;
            }  
        }
        swap(A,j, lastELe);
        /*int temp=A[j];
        A[j]=A[A.length-1];
        A[A.length-1]=temp;*/
        
        /*for(int i=0;i<A.length;i++) {
            System.out.print(A[i]+" ");
        }*/


       /*  System.out.println(Arrays.toString(A));
    }
     public static void swap(int A[],int i ,int j) {
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;

    }
    //Time Complexity is O(N)
    //Spacce complexity is O(1)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[]={9,8,1,6,5,11,4,7}; 
        rearrange(A);
    }*/

    //in case of subarrays we need to passs start(s) and end(e) to the function

    //2.Quicl sort


    
    //3.
    /*Given a 2D matrix sorted in row and col-wise
     * Given a target fixed in the matrix
     */

     
    public static boolean target(int A[][],int K) {
        int i=0;
        int j=A[0].length-1;
        while(i<A.length && j>=0) {
            if(A[i][j]==K) {
                return true;
            }
            if(A[i][j]<K) {
                i++;
            }
            else {
                j--;
            }
        }return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K=sc.nextInt();
        int N=sc.nextInt();
        int M=sc.nextInt();
        int A[][]=new int[N][M];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                A[i][j]=sc.nextInt();
            }
        }
    boolean ab=target(A, K);
    System.out.println(ab);
    sc.close();
    }
    
    
}
