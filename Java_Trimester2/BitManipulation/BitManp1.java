//20-11-2023
//BitManipulation
/*Bit wise Operators( &, |, ^ ,<< ,>>) 
 * XOR ==> 1,0==>1 */
// package DSA_Trimester2.BitManipulation;
// import java.util.*;

public class BitManp1{
//single number
//2 right shift
//3 left shift
//4 Get the bit
//5 set the bit
//6 Unset the bit


//1 Amazon Microsoft Adobe
/*Given an array where all the numbers appear even no. of times 
except one number which appearss odd number of times Find the only 
number which appears odd no.of.times
{2,2,3,3,7,7,6,6,5}==> 5
*/

/*public static int singleNumber(int A[]) {
    int ans=0;
    for(int i=0;i<A.length;i++) {
        ans=ans^A[i];
    }
    return ans;
}
public static void main(String[] args) {
    int A[]={2,2,3,3,7,7,6,6,5};
    int a=singleNumber(A);
    System.out.println(a+" ");
}*/


//Right shift
/*Given a positive no. N and portion i check if all the ith portion bit in N is a set or unset
 * 
 * N=21  ; i=2
 * 10101
 * true 
*/
/*public static boolean checkf(int N,int i) {
    if(((N>>i)&1)==1) {
        return true;
    }
    return false;
}
public static void main(String[] args) {
    int N=10;
    int i=1;
    boolean a=checkf(N, i);
    System.out.println(a);

}*/

	/*public static long reverse(long A) {
        long ans=0;
        for(long i=0;i<32;i++) {
            long lastd=A%2;
            ans=ans*2+lastd;
            A/=2;
        }return ans;
    }
    public static void main(String[] args) {
        long A=3;
        long a=reverse(A);
        System.out.println(a);
    }*/

    public static int getBit(int A, int i) {
        return(A>>i);
    }
    public static int setBit(int A,int i) {
        if(((A>>i)&1)==0) {
            A=A|(1<<i);
        }return A;
    }
    public static int unSetBit(int A, int i) {
        if(((A>>i)&1)==1) {
            A=A&~(1<<i); //we can use both A or (1<<i)
        }return A;
    }
    public static void main(String[]args) {
        int A=7;
        int i=2;
        int a=getBit(A, i);
        int b=setBit(A, i);
        int c=unSetBit(A, i);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
 }