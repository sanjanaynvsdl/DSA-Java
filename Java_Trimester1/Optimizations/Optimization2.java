package Optimizations;
// import java.util.*;

public class Optimization2 {
    /*
 * You have given a string S having lowercase English letters.
 * Calculate and return no of pairs(count of pair) (i,j) such that,
 * S.charAt(i) = 'a' and S.charAt(j) ='g'
 * and
 * i<j
 * Ex:
 * 0 1 2 3 4 5
 * S: "a b c g a g" => 3
 * Gc: 2 2 2 2 1 1
 * (0, 3)
 * (0, 5)
 * (4, 5)
 *
 * S: "g a b" => 0
 * S.length() <= 10^5*/
//Brute force!
    public static int countAGpairs(String S) {
        int c=0;
        for(int i=0;i<S.length();i++) {
            if(S.charAt(i)=='a') {
                for(int j=i+1;j<S.length();j++) {
                    if(S.charAt(j) =='g') {
                        c++;
                    }
                }
            }
        } return c;  
    }

    //in O(N) itretions called
    // carry forward technique
    public static int countPairs(String S) {
        int cg=0;
        int c=0;
        for(int i=S.length()-1;i>=0;i--) {
            if(S.charAt(i)=='g') {
                cg++;
            }
            else if (S.charAt(i)=='a') {
                c += cg;
            }
        } return c; 

    }


    /** Given an integer array A containing N distinct integers,
 * you have to find all the leaders in array A.
 *
 * An element is a leader if
 * it is strictly greater than all the elements to its left side */

    public static int countL(int A[]) {
        //O(N^2) itrtions
        int c=1;
        for(int i=1;i<A.length;i++) {
            int max = Integer.MIN_VALUE;
            for(int j=0;j<i;j++) {
                if(A[j]>max) {
                    max = A[j];
                }
                if(A[i]>max) {
                    c++;
                }
            }
        } return c;
    }
    //by N itrtions
    public static int countLl(int A []) {
        int c =1;
        int max = Integer.MIN_VALUE;
        for(int i=1;i<A.length;i++) {
            if(A[i]>max) {
                max =A[i];
                c++;
            }

        } return c;

    }
     public static int leaderr(int A[]) {
        int c=1;
        int max=A[0];
        for(int i=1;i<A.length;i++) {
            if(A[i]>max) {
                c++;
            }
        }
        return c;

    }



    //Amazon microsoft Adobe
    /*V* A wire connects N light bulbs.
98 * Each bulb has a switch associated with it; however, due to faulty wiring, a
99 * switch also changes the state of all the bulbs to the right of the current
100 * bulb.
101 * 1 -> ON
102 * 0 -> OFF
103 * N<=10^5
104 * 1 0 1 0 1 1 1 0 0 => 5
105 *
106 * 1 1 0 1 0 0 0 1 1
107 * 1 1 1 0 1 1 1 0 0
108 * 1 1 1 1 0 0 0 1 1
109 * 1 1 1 1 1 1 1 0 0
110 * 1 1 1 1 1 1 1 1  */
//refer assignments 3rd q


//intialize switch count with 0;
//if switch is 1 and we do even switches then it will retain the same state
//if switch is 0 and we we switch on it will change the state
//so to make 0 to 1 we and sC is even then we will switch on
//for odd count of sC it will be on state
public static int SwitchesC(int A[]) {
    int s=0;
    for(int i=0;i<A.length;i++) {
        if(A[i]==0) {
            if(s%2==0) {
                s++;
            }
        }
        else {
            if(s%2!=0) {
                s++;
            }
        }
    }return s;
}

    }
    
    
    

