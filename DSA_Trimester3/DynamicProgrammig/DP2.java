import java.util.Scanner;

public class DP2 {
    //Assignment=> de-code Question
    //1 NO. of paths 2D ad triangle
    //2 Minimum path sum
    //If there are on possibilities try out all possibilities(back-tracking)
    //3 Largest common sub-sequence
    //4 Edit distance


    //1
    /*No. of paths in a N X M from i,j to last cell */
    //Recursion (Also fucnction calls are repeated)
    public static int pathCount(int A[][],int i,int j) {
        if(i>=A.length || j>=A.length) {
            return 0;
        }
        if(i==A.length-1 || j==A.length-1) {
            return 1;
        }
        return pathCount(A, i+1, j)+pathCount(A, i, j+1);
    }
    //1
    //Dp
    public static int pathcount(int A[][],int i,int j) {
        if(i>=A.length || j>=A[0].length) {
            return 0;
        }
        if(i==A.length-1 || j==A.length-1) {
            return 1;
        }
        // if(A[i][j+1]==-1) {
        //     A[i][j+1]=pathcount(A, i, j+1);
        // }
        // if(A[i+1][j]==-1) {
        //     A[i+1][j]=pathcount(A, i+1, j);
        // }
        // A[i][j]=A[i][j+1]+A[i+1][j];
        A[i][j]=pathcount(A, i, j+1)+pathcount(A, i+1, j);
        return A[i][j];
    }
    //1
    //Iterative
    //Iterative method in this case start thinking from base case.
    public static int pathIterative(int N,int M) {
        int Dp[][]=new int[N][M];
        for(int i=0;i<Dp.length;i++) {
            Dp[i][Dp[0].length-1]=1;
        }
        for(int j=0;j<Dp.length;j++) {
            Dp[Dp.length-1][j]=1;
        }
        for(int i=Dp.length-2;i>=0;i--) {
            for(int j=Dp[0].length-2;j>=0;j--) {
                Dp[i][j]=Dp[i+1][j]+Dp[i][j+1];
            }
        }
        return Dp[0][0];
    }

    //2
    /*given a 2D-Matrix find the minimum path sum from (i,j) to last cell */
    //Recursion(2)
    //Assuming -> my function returns the minimum sum of the path to reach the last cell 
    public static int minPath(int A[][],int i,int j) {
        if(i>=A.length || j>=A[0].length) {
            return 0;
        }
        if(i==A.length-1) {
            return A[i][j]+minPath(A, i, j+1);
        }
        if(j==A[0].length-1) {
            return A[i][j]+minPath(A, i+1, j);
        }
        return A[i][j]+Math.min(minPath(A, i,j+1),minPath(A, i+1, j));
    }
    //Dp
    // public static int minPathDp(int A[][],int i,int j) {

    // }

    //3
    /*Given 2 STRINGS find the length of the LCS b/w the string  */


    public static void main(String[] args) {
        //1
        Scanner sc=new Scanner(System.in);
        // int N=4;
        // int A[][]=new int[N][N];
        // for(int i=0;i<A.length;i++) {
        //     for(int j=0;j<A[0].length;j++) {
        //         A[i][j]=-1;
        //     }
        // }
        // int z=pathcount(A, 0, 0);
        // System.out.println(z);
        // int x=pathIterative(N, N);
        // System.out.println(x);

        //minPathSum
        // int N=3;
        // int A[][]=new int[N][N];
        // for(int i=0;i<A.length;i++) {
        //     for(int j=0;j<A[0].length;j++) {
        //         A[i][j]=sc.nextInt();
        //     }
        // }
        // int z=minPath(A, 0, 0);
        // System.out.println(z);

        //Longests-sub-sequence
        // String S1="AEDFHR";
        // String S2="ABCDGM";
        // int lcs=LengthSub(S1, S2, S1.length()-1, S2.length()-1);
        // System.out.println(lcs);

        //Edit Distance
        String A="horse";
        String B="ros";
        int i=A.length()-1;
        int j=B.length()-1;
        int ans=minEdits(A,B,i,j);
        System.out.println(ans);;
    }
    //Longest common sub-sequence
    /*Given two strings find the length of the longest commmon sub-string */
    //recursion
    public static int LengthSub(String s1, String s2,int i, int j) {
        if(i<0 || j<0) {
            return 0;
        }
        if(s1.charAt(i)==s2.charAt(j)) {
            return LengthSub(s1, s2, i-1, j-1)+1;
        }
        return Math.max(LengthSub(s1, s2, i-1, j),LengthSub(s1, s2, i, j-1));
    }
    // Dp-recursion 
    public int lcsDP(String A, String B,int i, int j,int dp[][]) {
        if(i<0 || j<0) {
            return 0;
        }
        if(dp[i][j]!=-1) {
            return dp[i][j];
        }
        if(A.charAt(i)==B.charAt(j)) {
            return dp[i][j]=lcs(A,B,i-1,j-1,dp)+1;
        }
        dp[i][j]= Math.max(lcs(A,B,i-1,j,dp),lcs(A,B,i,j-1,dp));
        return dp[i][j];
    }
    // /* Iterative
    //  * Start thinking from the recursion base-case
    //  * Define the data-type required to store 1D or 2D array
    //  * Build the matrix using the recursion same condition.
    //  * Same approach is being used in the problems solving using dp and strings are given!
    //  */
    // public static int solve(String A, String B) {
        //Iterative:
    //     int dp[][]=new int[A.length()][B.length()];
    //     if(A.charAt(0)==B.charAt(0)) {
    //         dp[0][0]=1;
    //     }
    //     else {
    //         dp[0][0]=0;
    //     }
    //     for(int i=1;i<dp.length;i++) {
    //         if(A.charAt(i)==B.charAt(0)) {
    //             dp[i][0]=1+0;
    //         }
    //         else {
    //             dp[i][0]=dp[i-1][0];
    //         }
    //     }
    //     for(int j=1;j<dp[0].length;j++) {
    //         if(A.charAt(0)==B.charAt(j)) {
    //             dp[0][j]=1+0;
    //         }
    //         else {
    //             dp[0][j]=dp[0][j-1];
    //         }
    //     }
        
    //     for(int i=1;i<dp.length;i++) {
    //         for(int j=1;j<dp[0].length;j++) {
    //             if(A.charAt(i)==B.charAt(j)) {
    //                 dp[i][j]=1+dp[i-1][j-1];
    //             }
    //             else {
    //                 dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
    //             }
    //         }
    //     }
    //     return dp[dp.length-1][dp[0].length-1];
    // }

    //Edit distance
    /*Given two strings sa and sb convert sa to sb  using the following operatios 
     * insert in sa
     * delete in sa
     * update in sa
     * min no. of operations required to convert from sa go Sb 
     *  sa  : horse
     *  1st : rorse , rose , ros => 3 operations
     */
    public static int minEdits(String A, String B, int i, int j) {
        if(i<0 || j<0) {
            return 0;
        }
        if(A.charAt(i)==B.charAt(j)) {
            return minEdits(A, B, i-1, j-1); 
        }
        return Math.min(minEdits(A, B, i-1, j),Math.min(minEdits(A, B, i-1, j-1),minEdits(A, B, i, j-1)));

    }
}
