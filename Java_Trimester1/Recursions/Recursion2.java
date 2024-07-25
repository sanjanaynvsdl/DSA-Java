package Recursions;
import java.util.*;

//27-09-23
//explore goldratio and fibonacci.
public class Recursion2 {
     

    /*write a function which prints all elements of an array from index 0 to N-1 */
    public static void array1(int []A,int i) {
        //print all elements of A[] from index i to N-1
           if(i==A.length) return;
        System.out.println(A[i]);
                array1(A,i+1);     //output 1 2 3

    }

    public static void revArray(int []A,int i) {
        if(i==A.length) return;
        revArray(A,i+1);
        System.out.println(A[i]);  //output 3 2 1
    }

    public static int digitSum(int A) {  //1345 1+3+4+5 ==> 13
        if(A==0) return 0;
        //if(A<0) valid so can have multiple base conditions.
        return A%10+digitSum(A/10);

    }

    //check given String is palindrome or not .
    public static boolean isPalindrome(String S,int L,int R) {

        if(S.charAt(L)!=S.charAt(R)) {
            return false;
        }
            return isPalindrome(S,L+1,R-1);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A []= new int[N];
        for(int i=0;i<A.length;i++) {
            A[i]=sc.nextInt();
        }
        // int i;
       array1(A,0);
    
       sc.close();
    }

    
}
