public class cls1 {
    //DP
    //1 fibonacci(recursion)
    //2 Climbing  stairs





    //1 
    //find the nth fibonaci number - every number is the sum of the previouse two terms
    //f(n)=f(n-1)+f(n-2)
    //Time-complexity is 2*N
    //spcae complexity is O(N)
    //To calculate the space complexity it is nothing but the height of the tree
    //The max thaat the call-stack can be filled is N
    static int calls=0;
    public static int fib(int N) {
        
        if(N<=1) {
            return N;
        }
        return fib(N-1)+fib(N-2);
    }
    //1 Memoization
    //storing the values in the array
    //Time-complexity is O(N)
    public static int fibDP(int N, int A[]) {
        calls++;
        if(N<=1) {
            A[N]=N;
            return N;
        }
        if(A[N]!=-1) {
            return A[N];
        }
        A[N]=fibDP(N-1, A)+fibDP(N-2, A);
        return A[N];
    }


    //2
    //Climbing stairs
    public static int climbStairs(int N , int )
    public static void main(String[] args) {
        int ans=fib(5);
        System.out.println(ans);
        
        //for 5 it is 15 calls

        int N=5;
        int A[]=new int[N+1];
        for(int i=0;i<A.length;i++) {
            A[i]=-1;
        }
        ans=fibDP(5, A);
        System.out.println(ans);
        System.out.println("No of calls "+calls);
        //for 5 it is 9 calls
    }


    
}
