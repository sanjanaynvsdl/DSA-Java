package Basics;

import java.util.Scanner;

public class functions {
    /* 
    */
    public static int sum (int a,int b) {
              int S= a+b;
              return S;
    }
    public static void main (String args[]) {
          Scanner sc = new Scanner(System.in);
          int N = sc.nextInt();
          int M = sc.nextInt();
          int P = sum(N,M);
          System.out.print(P);
          sc.close();
    }
    public static int  multiplication (int a,int b) {
              return a*b;
    }
}