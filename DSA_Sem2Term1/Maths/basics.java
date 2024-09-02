import java.util.*;
public class basics {
    //1
    //printing factors in sorted order
    public static void printFactors(int N) {
        double limit = Math.sqrt(N);
        for(int i=1;i<limit;i++) {
            if(N%i==0) {
                System.out.print(i+" ");
            }
        }
        for(int i=(int)limit;i>=1;i--) {
            if(N%i==0) {
                System.out.print(N/i+" ");
            }
        }
    }

    //2
    public static int countFactors(int N) {
        int count=0;
        for(int i=1;i*i<=N;i++) {
            if(N%i==0) {
                count++;
                if(i!=N/i) {
                    count++;
                }
            }
        }
        return count;
    }


    //3
    //Prime numbers
    //sqrt(N) we are able to find weather a number is prime or not in sqrt(N) O(sqrt(N))
    static boolean isPrime(int N) {
        return countFactors(N)==2;
    }


    //4
    //Given a number N, find all the factors of all numbers from 1 to N
    /*
     * 1: {1}
     * 2: {1,2}
     * 3: {1,3}
     * 4: {1,2,4}
     */

     //O(N*sqrt(N))
     public static void printAllFactors(int N) {
        for(int i=1;i<=N;i++) {
            System.out.print(i+": ");
            printFactors(i);
            System.out.println();
        }
     }


     //5 Optimizing the above code
     //Checking out every multiple of i,

    public static void main(String[] args) {
        
        int N=36;
        printFactors(N);
        System.out.println();
        System.out.println(isPrime(N));
        printAllFactors(N);
        System.out.println(countFactors(N));
    }
    
}
