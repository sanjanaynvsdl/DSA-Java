
public class Searching5 {
    //17-11-23



    /*GIven a sorted array and has all distinct numbers you have to find any magic index  */
    public static int MagicalIndex(int A[]) {
        int s=0;
        int e=A.length-1;
        while(s<=e) {
            int mid=s+(e-s)/2;
            if(A[mid]==mid) {
                return mid;
            }
            if(A[mid]>mid) {
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }return -1;
    }
    public static void main(String[] args) {
        int A[]={-1,0,1,2,4,10};
        int a=MagicalIndex(A);
        System.out.println(a);
    }  



    /*GIven two sorted arrays find the median of the array which is the result of merging the two arrays
     * A={3,5,7,10,11};
     * B={1,2,,8,10,11,13,16};
     */

    
}
