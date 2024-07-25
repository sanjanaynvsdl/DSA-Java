package arraysss;
import java.util.*;


public class arrayss1D3 {
    /* write a function to rotate array k times
     * [1,2,3,4,5,6,7,8,9] k=4 rotate 4 times
     * [9,1,2,3,4,5,6,7,8] k=1st time
     * [8,9,1,2,3,4,5,6,7] k=2nd time
     * [7,8,9,1,2,3,4,5,6] k=3rd time
     * output
     * [6,7,,8,9,1.2.3.4.5] k=4th time
     */




    //commonmistake!
    /*public static void rightshift(int []A) {
        // {1,2,3,4,5,6} 
        int temp = A[A.length-1]; // last element means 6
        for(int i=0;i<A.length-1;i++) { 
            //1st i=0 {i+1=0+1=1 ==> index 1 i vaule will be assigned means 1 
            // if we run the loop again 1 is i value so it repeats
            //{6,1,1,1,} }
            A[i+1]=A[i];
        }
        A[0]=temp;
        //so this is the incorrect way of wrrting code
        // so we have to start loop in reverse order
    }
    */




public static void  rightshift(int A []) {
    //here we are jiust supoosed to make changes in array not return new array so we use void function
    int temp = A[A.length-1];
    for(int i=A.length-1;i>0;i--) { 
    //if we r in 0 index we cannot access before 
     // (i-1) results out f boundary make sure we does not take =0
     //here N itrations takes place 
        A[i]=A[i-1];
    }
    A[0]=temp;
}
public static void rotate(int [] A ,int K) {
    for(int i=0;i<K;i++) {
        rightshift(A);
        //now this should rotate for k times 
        // total K*N itretions takes place 
    }
}
public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);
   
    int K = sc.nextInt();
    int N =sc.nextInt();
    int A [] = new int [N];
    for(int i=0;i<N;i++) {
        A[i]=sc.nextInt();
    }
    rotate(A,K);
    for(int i=0;i<N;i++) {
        System.out.print(A[i]+" ");
    }
    sc.close();



}

}
