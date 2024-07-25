
package Optimizations;
// import java.util.*;
public class Optimizations4 {
    //1
    //to maximize the sum if we go with normal approches that leads to greedy approach!



    /*/SubArray ==> part of array 
    //it has contigous elements!
    //the elements next to eachother
    //[3,4,5,6,2,9,0]
    [3],[3,4,5],[6,2,9] == subarrays
    contigious to each other
    every range is also a subarray 
    we can also say subarraysun Quieries(previously solved questions
    L,R ==> subarray
    in case of subarray questions mostly prefix sum is used.
    /*SO when ever there is a question comes onsub arrays  and range sum  remember about prefix sum */
    //to calculate no. of subarrays =N(N+1)/2;


    /*Given a array write a function which return true if there is a  subarray whose sum ==0 */
    //brute force approach
    //  public static boolean subarraySum(int A[]) { 
    //         for(int i=0;i<A.length;i++) {
    //             int sum=0;
    //             for(int j=i;j<A.length;j++) {
    //                 for(int k=i;k<=j;k++) {
    //                     sum+=A[k];
    //                         if(sum==0) {
    //                         return true;
    //                     }
    //                 } 
    //             }
    //         }
    //         return false;
    //     }

    //Using subarrays 
    // public static int SubArray0(int A[]) {

    // }

    //Count the special index?!
    public  void specialIndex(int A[]) {
        int Pse[]=new int[A.length];
        int Pso[]=new int[A.length];
        Pse[0]=A[0];
        Pso[0]=0;
        for(int i=1;i<A.length;i++) {
            if(i%2==0) {
                Pse[i]=Pse[i-1]+A[i];
            }
            else if(i%2!=0) {
                Pso[i]=Pso[i-1]+A[i];
            }
        }
        System.out.println(Pse[3]);
        
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        
    }

 


    



    
}
