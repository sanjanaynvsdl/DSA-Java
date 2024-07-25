import java.util.*;
//Fibonacci
/*
 * Recursion
 * Dp Recursion
 * Iterative
 */
//2 maxSum 3 types
//3 Questions related to fibonacci 
public class DP1 {
    //revesion of rescursion fibonacci
    //reduce the time complexity of this to 2^N to O(N);
    //when fucntion=> calls are repeated we say, over-lapping sub-problem, 
    //All recursive codes are Depth first searching (DFS)
    //fibonacci solved in, top-down Dynamic programming
    //Also called memoizing

    //Dynamic programming:
    //It is all about Storing things using in future like (pre-calculated values=> prefix-sum) also called Dp
    //Bottom-uP DP(Iterative method)
    //Top-down DP(Recursion)
    //but, recursion is better than iterative method
    //In iterative we can reduce memory space too.
    //Edge cases are very important



    //recursion: in these case few funciton calls are repeated
    public static int fib(int N) {
        if(N<=1) {
            return N;
        }
        return fib(N-1)+fib(N-2);
    }
    //Optimized!
    //O(N)
    public static int fibonacci(int N,int F[]) {
      //fib(2)==1
      //fib(1)==1
       if(N<=2) {
        return 1;
       }
       if(F[N-1]==0) {
        F[N-1]=fibonacci(N-1, F);
       }
       if(F[N-2]==0) {
        F[N-2]=fibonacci(N-2, F);
       }
       return F[N-1]+F[N-2];
    }
    public static int fibb(int N,int F[]) {
        if(F[N]==0) {
            if(N<=1) {
                return N;
            }
            else {
                F[N]=fibb(N-1, F)+fibb(N-2, F);
            }
        }
        return F[N];
    }
    //Iterative method
    public static int fibIterative(int N) {
        int F[]=new int[N+1];
        F[0]=0;
        F[1]=1;
        for(int i=2;i<=N;i++) {
            F[i]=F[i-1]+F[i-2];
        }
        return F[N];
    }
     public static void main(String[] args) {
        int N=10;
        int A[]=new int[N+1];
        for(int i=0;i<A.length;i++) {
            A[i]=0;
        }
        //Recursion
        int f1=fib(N);
        //Recursion Dp
        //Method-1
        int f2=fibonacci(N, A);
        //Method-2
        int f3=fibb(N, A);
        //Iterative Dp
        int f4=fibIterative(N);
        
        // System.out.println(fib);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        //maxSum Question
        int B[]={2,7,9,3,1};
        int i=B.length-1;
        int max=maxSum(B, i);
        System.out.println(max);
        //maxSum using Dp recursion
        int Dp[]=new int[B.length];
        int j=B.length-1;
        int maxDp=maxSumDp(B, Dp, j);
        System.out.println(maxDp);
        //maxSum Iterative
        int maxSumIter=maxSumIter(B);
        System.out.println(maxSumIter);
        
    }

    //2
    /*Given a N stairs from any ith stair we can only move to i+1 or i+2 stair 
     * count the number of ways to reach the Nth step from 0 step
     * In these type of questions if we want information from prev one, we use DP 
     *  Equation F[N]=F[N-1] (Stairs) + F[N-2] Stairs
     */

     //3
     /*Given an array of (+ve numbers). Return the maximum sum without adding adjacent element
      * [2 3 7 1 1 9]
        [2 7 1]=10
        step-1: clearly understand what work should our function do!
        maxSum(A,N-1);
        maxSum from index 0 to index N-1;*
      */
      //Recursion
      public static int maxSum(int A[],int i) {
        if(i<0) {
            return 0;
        }
        return Math.max(A[i]+maxSum(A, i-2),maxSum(A, i-1));
      }
      //Dp Recursion
      public static int maxSumDp(int A[],int Dp[],int i) {
        if(i<0) {
            return 0;
        }
        if(i==0) {
            return A[0];
        }
        if(Dp[i]==0) {
            Dp[i]=Math.max(A[i]+maxSumDp(A,Dp, i-2),maxSumDp(A,Dp, i-1));
        }
        return Dp[i];
      }
      //maxSum Iterative 
      //In the case of iterative always start thinking about the base-case and start building array from base-case
      public static int maxSumIter(int A[]) {
        int Dp[]=new int[A.length];
        Dp[0]=A[0];
        Dp[1]=A[1];
        for(int i=2;i<A.length;i++) {
            Dp[i]=Math.max(A[i]+Dp[i-2],Dp[i-1]);
        }
        return Dp[Dp.length-1];

      }
      //3
      /* Ways to party
       * Given N people inside a hall
       * 1. Being Alone
       * 2. Getting paired with one person
       */
      public int fib(int A,int F[]) {
        if(A==1) {
            return 1;
        }
        if(A==2) {
            return 2;
        }
        if(F[A-1]==0) {
            F[A-1]=fib(A-1,F);
        }
        if(F[A-2]==0) {
            F[A-2]=fib(A-2,F);
        }
        return (F[A-1]%10003+(A-1)*F[A-2]%10003)%10003;
    }
    
}
