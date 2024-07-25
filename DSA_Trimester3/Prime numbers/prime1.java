// import java.lang.reflect.Array;
import java.util.*;

public class prime1 {

    //Prime number
    //04-03-2024
    /* if a positive number exactly have only two positive factors is called prime number */
    //1 check prime
    //2 generate prime numbers till N (Using sieves algrithm) TC( O(N))
    //3 sieve Algo for prime numbers 
    //4 extender sieve alsgo (explore)
    //5 given a number N return all the prime fastors of N.
    //6 give Q queries return all the prime factors of N less than O(N^sqrroot(N))
    // When-ever you got queries think about pre-processing!


    //1
    public static boolean checkPrime(int A) {
        //this takes O(N) to reduse O(sqrt(N)) use i*i<N 
        //since, every number has a pair! so, we can reduce number of iterations
        for(int i=2;i<A;i++) {
            if(A%i==0) {
                return false;
            }
        }
        return true;
    }
    //2
    /*Generate prime numbers till N */
    //TC : O(N*(sqrt(N))) coz check prime runs for (sqrt(N))
    public static ArrayList generatePrime(int A,ArrayList<Integer> ans) {
        for(int i=2;i*i<A;i++) {
            if(checkPrime(A)) {
                ans.add(i);
            }
        }
        return ans;
    }
    //Using sieves algorithm 
    //find the number of prime numbers 
    //To get no. of prime numbers is 1 to A range create [N+1] range 
    //In java by default value is false so, first make everything into true
    public static ArrayList<Integer> primeNumbers(int A) {
        boolean[] isPrime=new boolean[A+1];
        ArrayList<Integer> primes=new ArrayList<>();
        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=2;i<=A;i++) {
            isPrime[i]=true;
        }
        // This loop is iterating over each integer from 2 to A (inclusive). For each integer i, it sets isPrime[i] to true. 
        for(int i=2;i*i<=A;i++) {
            if(checkPrime(i)) {
                for(int j=i*i;j<=A;j+=i) {
                    isPrime[j]=false;
                }
            }
        }
        for(int i=2;i<=A;i++) {
            if(isPrime[i]==true) {
                primes.add(i);
            }
        }
        return primes;
    }
    //5
    /*Given a number N return all the prime factors of N */ 
        public  static ArrayList<Integer> primeFactors(int N) {
            ArrayList<Integer> ans=new ArrayList<>();
            for(int i=2;i*i<=N;i++) {
                while(N%i==0) {
                    ans.add(i);
                    N=N/i;
                }
            }
            if(N>1) {
                ans.add(N);
            }
            return ans;
        }
    /* Given Q Queiries generate prime numbers for each query TC less than  O(N*generatePrime) TC */
    // public static 
    public static void main(String[] args) {
        int A=30;
        //Output : 2 3 5 7 11 13 17 19 23 29 
        ArrayList<Integer> ans=new ArrayList<>();
        ans=primeFactors(A);
        // ans=primeNumbers(A);
        for(int i=0;i<ans.size();i++) {
            System.out.print(ans.get(i)+" ");
        }
    }
}
// If two dice are thrown, what is the probability that the sum of the two dice will be a prime number?
    

    
