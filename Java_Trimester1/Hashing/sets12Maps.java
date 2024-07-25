package Hashing;
import java.util.*;

public class sets12Maps {

    //Space complexity 
    public static int[] func(int N,int []inputArray) { //input space fixed
        // int [] A = new int[N];
        int [] output = new int[N]; //extra space created 

        return output;  //output space 

        //space complexity ==> input(SPace)+ extra (Space) + output(space)
        //we cannot make changes in input /output 
        //space complexity refers to extra spacecreated in the programme
        //we can only optimize the extra space in it.


        /* 1. GIven an array of size N and Q queiries,
         * for every query checks if the element is present in the array or not
         * A[4,2,4,5,9] Q =4;
         * 5 ==> true
         * 11 ==>false
         */

    }
    //time complexity o[N] 
     public static boolean isPresent(int[] A , int num) {
        for(int i=0;i<A.length;i++) {
            if(A[i]==num) {
                return true;
            }
        }
        return false;
     }


     //writing a function to find common uniq elements in two arerays
     //for every element in array A it checks present in B or not.
     //O(N^2) //O(Q*N)
     public static void printCommonE(int []A ,int []B) {
        for(int i=0;i<A.length;i++) {
            if(isPresent(B,A[i])) { //O(N)
                System.out.println(A[i]+" ");
            }
        }

     }
     //called Q times so finally o[QN] complexity
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int A []={2,4,3,7,8,1,10,13,152,7,8};
        int Q = sc.nextInt();
        for(int i=0 ; i<Q;i++) {
            int num = sc.nextInt();
            System.out.println(isPresent(A,num));
        }
        sc.close();

    }

    /*Given an array of A print all distinct elements
     * A[1,2,3,4,4,5,3,2,]
     * A [1,2,3,4,5]//itretions O[N^2]
     * A[4,4,4,4] itretions O[N]
     */
    
     
     public static void printDistinctE(int [] A) {
        // int c = 0;
        for(int i=0;i<A.length;i++) {
            boolean found = false;
            for(int j=0;j<A.length;j++) {
                if(A[i]==A[j]) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                System.out.println(A[i]+" ");
            }
        }
     }

     /* in all this cases we can see it takes O(N^2) itretions we can reduce all this to 
      O(N) itretions by using Hastsets data structures things are bucketized so that we can easily 
      itrtrate over the loop 
      
      
      
      different data structures
      Binary trees
      Binary search tree
      balanced binary search 
      self balancing  binary search
      */

      //syntax (same as arraylist)
     HashSet<Integer> set = new HashSet<Integer>();

    /*set.add(1);
     set.contains(1); 
     if yes returns true
     set.size();
     set.remove(2);
     */


     
 }
    

