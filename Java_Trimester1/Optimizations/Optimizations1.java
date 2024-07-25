package Optimizations;
import java.util.*;

public class Optimizations1 {
    //we can optimize by using hashsets and hashmaps

    //Brute force
    /*GIven an array return true if sum==k (A[i]+A[j==k] and i!=j) */
    /*public static boolean sum (int A[], int k) {
        //for every i  (j) loop runs (i+1) and checks
        for(int i=0;i<A.length;i++) {
            for(int j=i+1;j<A.length;j++) {
                if( i!=j && A[i]+A[j] == k) {
                    return true;
                }

            }
        } return false;
    }
        
        
        //HashSet<Integer> set = new HashSet<Integer>();
        //Tc = O(N)pvsm
         public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int k = sc.nextInt();
            int N = sc.nextInt();
           int A [] = new int [N];
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<A.length;i++) {
            int pair = k - A[i];
            if(set.contains(pair)) {
                System.out.println("true");
            }
            else{
                set.add(A[i]);
            }
        }
        System.out.println("false");*/




        /** Given an array. Write a function which prints all elements which occur odd
         * number of times.
         * A: [2, 4, 3, 6, 2, 4, 7, 2, 7]
         * 2, 3, 6
         * {2, 3, 6} */


         
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A [] = new int [N];
        for(int i=0;i<N;i++) {
            A[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> Map = new HashMap<>();
        for(int i=0;i<N;i++) {                //for(int ele : A)
            if(Map.containsKey(A[i])) {       //if(Map.containsKey(ele))
                int freq = Map.get(A[i])+1;
                Map.put(A[i],freq);
            }
            else {
                Map.put(A[i],1);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int ele : Map.keySet()) {
            if(Map.get(ele)%2!=0) {
                ans.add(ele);
            }
        }
        System.out.println(ans);
        sc.close();



        

    }
}

