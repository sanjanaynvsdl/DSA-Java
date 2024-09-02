
// import java.util.*;
//Binary Search

public class Searching1 {
    /*public static void main(String[] args) {


        /*Given a 2D array sorted array row ANd ccol wise
         * Given a target find in the matrix.
         */

         //Time complexity is in O(N^2) iteration.
         
        /*Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[][]=new int[N][N];
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                A[i][j]=sc.nextInt();
            }
        }
        int target=sc.nextInt();
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                if(A[i][j]==target) {
                    System.out.println(i+" "+j);
                }
            }
        }*/
    


    //Binary search
    //discarding half of our search space 
        /*public static int BinarySearch(int A[],int K) {
        int s=0;
        //start index
        int e=A.length-1;
        //last index
        while(s<=e) {
            int mid=(s+e)/2; 
            //s+(e-s)/2==mid
            if(A[mid]==K) {
                return mid;
            }
            else if(A[mid]>K) {
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        } return -1;
    } */

    public static int floorValue(int A[],int K) {
        int s=0;
        int e=A.length-1;
        int ans=Integer.MIN_VALUE;
        while(s<=e) {
            int mid=s+(e-s)/2;
            if(A[mid]==K) {
                return A[mid];
            }
            else if(A[mid]>K) {
                //ans=A[mid]; ceil value
                e=mid-1;
            }
            else{
                ans=A[mid];
                s=mid+1;
                //e=mid;//(for ceil value)
            }
            
        }return ans;
    }


    /*public static int CeilValue(int A[],int k) {
        int s=0;
        int e=A.length-1;
        int ans = Integer.MIN_VALUE;
        while(s<=e) {
            int mid=(s+e)/2;
            if(A[mid]<k) {
                return s;
            }
            if(A[mid]>k) {
                ans=A[mid];
                e=mid-1;
                
            }
        }return ans;
    }*/
    public static void main(String[] args) {
        int A[]={2,5,7,9,10,11};
        int k=8;
        int ab = floorValue(A,k);
        System.out.println(ab);
    }
}
    /*Given a sorted aray find the floor value
     * floor(Target = largest number which is less than or equals to target )
     */
    



    

