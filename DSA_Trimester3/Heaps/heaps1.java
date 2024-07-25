import java.uitl.*;
//1 Delete
//2 Insert
//3 Build heap

class Heap{
    int A[];
    int size;
    public Heap(int n) {
        A=new int [n];
        size=n;
    }
}
//Heaps
//Heaps are same as balanced binary tree( Complete binary tree)! 
//Height : O(logN)
//Does not use extra space for a every given array of level order traversal 
//we iterate in array it-self (drawing it like a tree => that would be easier)
//We do not construct binary tree for heaps=>NO EXTRA SPACE

public class heaps1 {

    //Delete 
    //shift -down or percolate down
    //we are bringing down to its correct position!
    public void swap(Heap heap, int i, int j) {
        int temp=heap.A[i];
        heap.A[i]=heap.A[j];
        heap.A[j]=temp;
    }
    public void deleteMin(Heap heap) {
        // swap(heap, 0, size-1);
        int temp=heap.A[0];
        heap.A[0]=heap.A[size-1];
        heap.A[size-1]=temp;
        size--;
        int i=0;
        while(i<size) {
            int minIndex=i;
            int left=2*i+1;
            int right=2*i+2;
            if(left<size && heap.A[left]<heap.A[minIndex]) {
                int temp1=heap.A[left];
                heap.A[left]=heap.A[minIndex];
                heap.A[minIndex]=temp;
                minIndex=left;
            }
            if(right<size && heap.A[right]<heap.A[minIndex]) {
                int temp2=heap.A[minIndex];
                heap.A[minIndex]=heap.A[right];
                heap.A[right]=temp;
                minIndex=right;
            }
            // if(minIndex==left || minIndex==right) {
            //     break;
            // }
            int temp3=heap.A[i];
            heap.A[i]=heap.A[minIndex];
            heap.A[minIndex]=temp;
            i=minIndex;


        }

    }
    public static void main(String[] args) {

        
    }
    
}
