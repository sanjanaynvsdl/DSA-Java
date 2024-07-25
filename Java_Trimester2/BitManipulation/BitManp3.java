// package DSA_Trimester2.BitManipulation;
import java.util.*;

public class BitManp3 {
    //1 Sum and diff of pairs
    //2 Min XOR value of a pair in array!
    //3 Max and '&' value in any pair in an array 


    /*Given an array A for every pair of elements in the array. 
    Return the sum of the diff b/w bits of every pair of elemnst
     * A[3 5 6 8]
     * pairs   (0,1)
     *         3=011 
     *         5=101 
     *         -----
     *        2 (diff bits)
     * (0,2) =2
     * (0,3) =3
     * (1,2) =2
     * (1,3) =3
     * (2,3) =3 sum=15;
     * 
     */

     //Brute force time complexity=(N^2log max)
     public static int checkBit(int xor){
        int c=0;
        for(int i=0;i<32;i++) {
            if(((xor>>i)&1)==1) {
                c++;
            }
        }return c;
     }

     public static int sum(int A[]) {
        int ans=0;
        for(int i=0;i<A.length;i++) {
            int xor=0;
            for(int j=i+1;j<A.length;j++) {
                xor=A[i]^A[j];
                ans += checkBit(xor);   
            }
        }return ans;
     }
     /*public static void main(String[] args) {
        int A[]={3,5,6,8};
        long a=sumofBits(A);
        System.out.println(a);
     }*/

     public static long sumofBits(int A[]) {
        long ans=0;
        int M=10^9+7;
        for(int i=0;i<32;i++) {
            int set=0;
            int Unset=0;
            for(int j=0;j<A.length;j++) {
                if(((A[j]>>i)&1)==1) {
                    set++;
                }
                else {
                    Unset++;
                }
            }
             ans = ((ans%M)+(((set%M)*(Unset%M))%M))%M;
        }return ans;
        
     }

     //2 
     /* Given an array of +ve integers. Find the pair with min Xor value
      * [7,3,11,10,6,2,3] == 3^3 ==0 0 is min xor
      The answeer must be in one of the consecutive 
        pairs in the array
      */
      public static int minXOr(int A[]) {
        int minxor=Integer.MAX_VALUE;
        Arrays.sort(A);
        for(int i=0;i<A.length-1;i++) {
           int xor=A[i]^A[i+1];
           minxor=Math.min(minxor,xor);
        }return minxor;
      }
      /*public static void main(String[] args) {
        int A[]={7,3,11,10,6,2,3};
        int ans=minXOr(A);
        System.out.println(ans);
      }
} */

//3
/*Given an array of +ve integers return the max '&'
value of any pair i.e. return (A[i]&A[j])  (i!=j)*/
public static int ManAnd(int A[]) {
    int ans=0;
    for(int i=31;i>=0;i--) {
        int setBitc=0;
        for(int j=0;j<A.length;j++) {
            if(((A[j]>>i)&1)==1) {
                setBitc++;
            }
        }
        if(setBitc>=2) {
            ans=ans|(1<<i);
            for(int j=0;j<A.length;j++) {
                if(((A[j]>>i)&1)==0) {
                    A[j]=0;
                }
            }

        }
    }
    return ans;
}
public static void main(String[] args) {
    int A[]={4,8,12,16};
    int ans=ManAnd(A);
    System.out.println(ans);
}

}
//SubSequence
// just as subaaray butbnot contigious 
//the elements need not to be contigious
//But they should be in the same order as in the array
//There can be any duplicates in the subsequence
//In given array 2^N no. of subsequences are possible