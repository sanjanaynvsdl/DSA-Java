
public class Searching3Impp {

     //1 Aggressive cows
    //2 Painter's partition.

    /*Given sorted arrayof +ve integers in ascending order
     * 1.This array represents the position of rooms where cows can be placed 
     * 2. Given +ve no. K count of cows K<=N K>=2
     * 
     * return the max value of the min distance between  any two cows.
     */
    


     //step1 : try to find the target so that we can look into search space;
     //target=distance between the two closest pair  of cows
     //Min pssble ans=1;
     //Max pssble ans=A[N-1]-A[0] ==> if cows placed in first and last 
    
    /*public static boolean check(int A[],int B,int mid) {
        int prepos=A[0];
        int cowPlac=1;
        for(int i=0;i<A.length;i++) {
            if(A[i]-prepos>=mid) {
                cowPlac++;
                prepos=A[i];
            }
            if(cowPlac==B) {
                return true;
            }
        }return false;

    }
     public static int AggresiveCows(int A[],int B) {
        int s=1;
        Arrays.sort(A);
        int e=A[A.length-1]-A[0];
        int ans=1;
        while(s<=e) {
            int mid=s+(e-s)/2;
            if(check(A,B,mid)) {
                ans=mid;
                s=mid+1;
            }
            else {
                e=mid-1;
            }
        }return ans;
     }
     public static void main(String[] args) {
       int  A[] = {1, 2, 3, 4, 5};
       int B=3;
       int a=AggresiveCows(A, 3);
       System.out.println(a);
     }*/


     //
}
