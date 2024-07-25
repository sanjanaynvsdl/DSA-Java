package Basics.patterns;
import java.util.*;

public class patterns2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        // (K)
        /*for(int i=1;i<=N;i++) {
            for(int j=1;j<=N-i+1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=2;i<=N;i++){
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

      /*for(int i=1;i<=N;i++) {
        for(int j=1;j<=N;j++) {
           if(i==1||i==N||j==1||j==N) {
            System.out.print("*");
           }
           else {
            System.out.print(" ");
           }
        }
        System.out.println();
      }*/

      for(int i=N;i>=1;i--) {
        for(int j=1;j<N;j++) {
            System.out.print(" ");
        }
        for(int k=1;k<=(2*i-1);k++) {
            if(k==1||k==N||k==2*i-1) {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
      }
    }
    
}
