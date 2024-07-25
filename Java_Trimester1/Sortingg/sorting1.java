package Sortingg;
//  import java.util.*;

public class sorting1 {
    /*the process of arranging elements in a particular order */

    //Bubble sort
    //Selection sort 
    //Insertion sort
    //Merge sort
    //Quick sort
    //Heap sort

  /*Bubble Sort     : Simple and inefficient, suitable for small datasets.
    Selection Sort  : Simple but still inefficient.
    Insertion Sort  : Efficient for small datasets or nearly sorted data.
    Merge Sort      : Efficient and stable for larger datasets.
    Quick Sort      : Efficient for large datasets but not stable.
    Heap Sort       : Efficient and can be used for large datasets.
    
    
    Arrays.sort()
    collections.sort()==Linked lists,ArrrayLists*/



    //Bubble sort
    /*the largest element is placed in the last*/


    public static void printArray(int A[]) {
        for(int i=0;i<A.length;i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();

    }
    /*public static void main(String[] args) {
        int A[]={7,8,3,1,2};
        //Time complexity is O(N^2)
        //we can do it in NlogN time complexity alsoo
        for(int i=0;i<A.length-1;i++) {
            for(int j=0;j<A.length-i-1;j++) {
                if(A[j]>A[j+1]) {
                    //swap
                    int temp=A[j+1];
                    A[j+1]=A[j];
                    A[j]=temp;
                }
            }
        }
        printArray(A);
    }*/


    //Selection sort

    /*the smallest element is placed first will run a lopp and compares
     with all elemnts which is smaller.
     1 iteration==1swap */


     public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int A[]={7,8,3,1,2};
        for(int i=0;i<A.length-1;i++) {
            int small=i; 
            for(int j=i+1;j<A.length;j++) {
                if(A[small]>A[j]) {
                    small=j;
                }
                int temp=A[small];
                A[small]=A[i];
                A[i]=temp;
            }
        }
        printArray(A);
            
     }
    

}
    