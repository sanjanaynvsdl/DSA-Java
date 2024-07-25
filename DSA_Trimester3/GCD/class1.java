public class class1 {

    //15-03-2024
    //1 mistakes from exam (Google) Question
    //2 GCD Greatest common divisor
    //Using  3 methods
    //3  Array of sub-sequence GCD=1
    //4 Array calculate GCD of factorial
    //5 Puzzle O(N log N)





    //1
    /*Given a number N and Array A[] of digits 1 to 9 return the A%N 
     * |A| <=10^9
     * 0<=A[i]<=9
     * (from this question : we can understand how to apply mod for evey step)
     */

    public int moduloo(int A[],int N) {
        for(int i=A.length-1;i>=0;i--) {

        }
        return 1;
    }

     // GCD

     //TC : Linear search O(N)
     public int GCD1(int A,int B) {
        if(A==0 || B==0) {
            return A+B;
        }
        for(int i=Math.min(A,B);i>=1;i--) {
            if(A%i==0 && B%i==0) {
                return i;
            }
        }
        return -1;
    }
    //GCD of complete array
    public int arrayGCD(int A[]) {
        int ans=0;
        for(int i=0;i<A.length;i++) {
            ans=GCD1(ans,A[i]);
        }
        return ans;
    }
    //Using recursion
    public static int GCD2(int a,int b) {
        //values cannot be negative so first convert to +ve and then find gcd
    //    a=Math.abs(a);
    //    b=Math.abs(b);
        if(a<b) {
        int temp=a;
            a=b;
            b=temp;
        }
        if(b==0) {
            return a;
        }
        return GCD2(b,Math.abs(a-b));
    }
    //Using Mod 
    //TC: O(logN) 
    public static int GCDmod(int A,int B) {
        if(B==0) {
            return A;
        }
        return GCDmod(B,A%B);
    }


    //3
    /*Given a Array return true if there exist a sub-sequence of GCD=1 
     *calculate the GCD of complete array if it comes as 1 so, we can assure that the array has GCD = 1 
    */
    public static boolean subsequenceGCD(int A[]) {
        int ans=A[0];
        for(int i=1;i<A.length;i++) {
            ans=GCD2(ans,A[i]);
        }
        if(ans==1) {
            return true;
        }
        return false;
    }

    //4
    /*Given a array calculate the GCD of factorial of all values
     * (4!,3!,6!,7!) ==> 6
     * ans: factorial of smalles number 3! 
     * Asked in (paytm)
     */
    //O(N) to iterate over array + O(M) to find the factorial
    public static int factorialGCD(int A[]) {
        int ans=Integer.MAX_VALUE;
        int ans2=1;
        for(int i=0;i<A.length;i++) {
            ans=Math.min(ans,A[i]);
        }
        for(int i=ans;i>=1;i--) {
            ans2=ans2*i;
        }
        return ans2;
    }

    public static void main(String[] args) {
        int A=24;
        int B=32;
        int gcdd=GCD2(A,B);
        System.out.println(gcdd);
        int ans2=GCDmod(A,B);
        System.out.println(ans2);
        int C[]={4,5,6,3,7,8,9};
        int ans=factorialGCD(C);
        System.out.println(ans);
        int Z[]={2,3,4,5,6,7};
        // boolean sub=




    }
}
