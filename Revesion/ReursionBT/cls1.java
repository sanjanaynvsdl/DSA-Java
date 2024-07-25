public class cls1{
    public static int sum(int N) {
        if(N==0) {
            return 0;
        }
        return N+sum(N-1);
    }
    //digitSum
    public static int digitSum(int N) {
        if(N==0) {
            return 0;
        }
        return N%10+digitSum(N/10);
    }
    //Factorial 
    public static int factorial(int N) {
        if(N==0) {
            return 1;
        }
        return N*factorial(N-1);
    }
    //pattern printing 
    /*
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     */
    public static void printPattern(int N) {
        if(N==0) {
            return;
        }
        printPattern(N-1);
        for(int i=1;i<=N;i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    //[attern printing-2
    /* 1 2 3 4
     * 1 2 3
     * 1 2
     * 1
     */
    public static void printPattern2(int N) {
        if(N==0) {
            return;
        }
        for(int i=1;i<=N;i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        printPattern2(N-1);
    }
    //pattern printing-3
    /* 1 2 3 ..  N-1
     * 1 2 3 .. N-2
     * 1 2 
     * 1
     * 1 2 
     * 1 2 3
     * 1 2 3 4
     */
    public static void printPattern3(int N) {
        if(N==1) {
            System.out.println("1");
            return;
        }
        for(int i=1;i<=N;i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        printPattern3(N-1);
        for(int i=1;i<=N;i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    //power 
    //optimization of power 
    //typecasting and over-flows
    //is palindrome using helper funciton
    //Tower of hanoi 
    //practice recursion problems from code-forces
    public static void main(String[] args) {
        // System.out.println(sum(5));
        // System.out.println(digitSum(1234));
        // System.out.println(factorial(5));
        // printPattern(5);
        // printPattern2(5);
        printPattern3(5);
    }
}
