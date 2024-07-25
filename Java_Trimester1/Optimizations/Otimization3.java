package Optimizations;


public class Otimization3 {
     /*to count no of elements in range [L,R]==> R-L+1  [a,b] b-a+1;
     * to get sum we use in range after prefix sum[L,R] ==> (R)-(L-1) 
     * example : overs in cricket it is cummulative sum
     */



/* Given an array of N elements and Q queries.
 * For each query, Given L and R,
 * calculate and print the sum of all elements in the range [L,R], L & R
 * inclusive.
 * 0 1 2 3 4 5 6 7
 * arr = {2, 3, 5, 1, 3, 5, 6, 9}
 * Q:3 L,R
 * i: [1, 5] => 17
 * i: [3, 4] => 4
 * i: [5, 5] => 5*/


    public static void rangeSumQ(int []A,int[][]Qurs) {
        //Li =Q[i][0]
        //Ri = Q[i][1]
        // int Q = Qurs.length;
        for(int i=0;i<A.length;i++) {   //Q itretions
            int L = Qurs[i][0];
            int R = Qurs[i][1];
            //we have to print the sum in b/w L,R
            int sum=0;
            for(int j=L;j<=R;j++) {  //R-L+1 ==>N itrtions
                sum += A[j];

            }
            System.out.println(sum); //total QN itretions
        }
    }

    //we can optimize this By creating a cummulative sum array
    //called prefix sum
    //  ar=         [2, 3, 5, 1, 3, 5, 6, 9]
    // * Prefix Sum:[2, 5, 10, 11, 14, 19, 25, 34]
    // * Prefix Sum[i] => sum of all elements of array A from index 0 to index i
    // * SUM[L, R] => PS[R] - PS[L-1]
    public static int[] PrefixSum(int[]A) {
        int []PS= new int [A.length];
        for(int i=0;i<A.length;i++) {
            int sum=0;
            for(int j=0;j<=i;j++) {
                sum += A[j];
            }
            PS[i]=sum;
        }
        return PS;  //O(N^2)
    }
     
    public static int[] buildPrefixSum(int []A) {
        int [] PS = new int [A.length];
        PS[0]=A[0];
        for(int i=1;i<A.length;i++) {
            PS[i]=PS[i-1]+A[i];
        }return PS; //O(N)

    } 
    public static void main(String[] args) {
         int[] A = { 2, 3, 5, 1, 3, 5, 6, 9 };
         int[][] Qurs = { { 1, 5 }, { 3, 4 }, { 5, 5 }, { 4, 6 }, { 0, 4 } };
         rangeSumQ(A, Qurs);
    }
         /*
         * Solve using PS
         * 1. Building the PS => O(N)
         * 2. Solve Q queries => O(Q)
         * TC: O(N+Q)
          */


          /*2./*
 * Given an array arr of N elements and Q queries. For each query, given L &
R.
 * Calculate and print the number of even numbers in given range i.e, [L,R].
 * arr = {4, 2, 3, 5, 2, 7, 6}
 * 1, 2 => 1
 * 2, 6 => 2
 * PS[i] => Number of even elements from index 0 to i
 * PS[0] => A[0]%2==0 ? 1 : 0;
 * if(A[i]%2==0)
 * PS[i] = PS[i-1] + 1
 * else
 * PS[i] = PS[i-1] */
public static int [] evenC(int []A) {
    int PS[] = new int[A.length]; 
        if(A[0]%2==0) {
            PS[0]=1;
        }
        else {
            PS[0]=0;
        }
        for(int i=1;i<A.length;i++) {
            if(A[i]%2==0) {
                PS[i]=PS[i-1]+1;
            }
            else {
                PS[i]=PS[i];
            }
        }
        return PS; //last index has the count of all even numbers
    
}


/* Given an array of N elements, return the total count of equilibrium index.
 * An index i is said to be equilibrium if:
 *
 * Sum of all elements on left of ith index = Sum of all elements on right side.
 * of ith index.
 * 0 [1, 2, 3, 5, 1, 5] 0 => 1
 * if ith element is equilibrium
 * sum[0, i-1] == sum[i+1, N-1]
 * sum[0, i-1]=> PS[i-1]
 *    [  L , R ]      [L-R-1]
 * sum[i+1, N-1] => PS[N-1] - PS[i]
 * TC:
 * 1. Build the PS => O(N)
 * 2. Count equ index=> O(N)
 * TC: O(N)
 * SC: O(N) [Ps] => O(1*/


    
    
}
