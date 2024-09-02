
// import java.util.*;


public class BinarySearch {
    public static int BinarSearch(int A[], int K) {
        int s=0;
        int e=A.length-1;
        while(s<=e) {
            int mid=s+(e-s)/2;
            if(A[mid]==K) {
                return 1;
            }
            if(A[mid]>K) {
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }return -1;
    }
    public static void main(String []args) {
        int A[]={2,3,4,9,12,14,16,18,20};
        int b=4;
        int a= BinarSearch(A,b);
        System.out.println(a);
    }
    
}
