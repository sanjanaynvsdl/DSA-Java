package Optimizations;
// import java.util.*;

public class Opt3 {


    public static int[] RangeevenC(int A[],int L[],int R[]) {
        int ps[]=new int[A.length];
        ps[0]=A[0];
        for(int i=1;i<A.length;i++) {
            ps[i]=ps[i-1]+A[i];
        }
        return ps;

        

    }
    public static void main(String[] args) {
        
    }
    
}
