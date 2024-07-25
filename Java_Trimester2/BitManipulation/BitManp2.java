// package DSA_Trimester2.BitManipulation;
import java.util.*;

public class BitManp2 {
//1. Toggle ith element to set/unset
//2. Single number (two number)
//3. single number(3 numbers)



/*Given a number N toggle the ith bit 
 * if it is set==>Unset
 * if it is unset==>Set
 * return the resulting number!
 * N=10 i=1 1010 ==>  1000=8
 * TC(1)
 */

public static int check(int N,int i) {
    return N^(1<<i);
}
//2
/*Given an array of positive numbers every element appears two times 
except two element find both the single elements
A:3,6,4,5,3,6==> (4,5)
*/
public int xorVal(int []A) {
    int xor=0;
    for(int i=0;i<A.length;i++) {
        xor=xor^A[i];
    }
    return xor;
}
public int position(int xor) {
    int p=0;
    for(int i=0;i<32;i++) {
        if(((xor>>i)&1)==1) {
            p=i;
            break;
        }
    }
    return p;
}
public int[] solve(int[] A) {
    int ans[]=new int[2];
    int xorr=xorVal(A);
    int p=position(xorr);
    int xorSet=0;
    int XorUnset=0;
    for(int i=0;i<A.length;i++) {
        if(((A[i]>>p)&1)==1) {
            xorSet=xorSet^(A[i]);
        }
        else {
            XorUnset=XorUnset^(A[i]);
        }
    }
    ans[0]=xorSet;
    ans[1]=XorUnset;
    Arrays.sort(ans);
    return ans;
}
/*Given an array when all elements appear thrice expect an 
element which appear exactly once.Find the single number.
5,7,8,6,9,8,7,5}=={9,8 }
*/
    public static int SingleNUmber(int A[]) {
        int ans=0;
        for(int i=0;i<32;i++) {
            int c=0;
            for(int j=0;j<A.length;j++) {
                if(((A[i]>>i)&1)==1) {
                    c++;
                }
            }
            if(c%3!=0) {
                ans=ans|(1<<i);
            }
        }return ans;

    }
}
