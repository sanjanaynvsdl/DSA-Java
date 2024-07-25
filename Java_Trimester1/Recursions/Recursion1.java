package Recursions;
// import java.util.*;

public class Recursion1 {
    //inside memory we have something called call stack.
    //Function snapshot are going to be saved in function stack or call stack.(in memory).
    //Stored in memory it is accesed ass (LIFO)-->last in first out.
    //whenever scenariors problems things keep repeating again nd again  these are called recursion.

    //Recusrion -->repetation of exact same problem ,same function.
    //same thing happens again nd again in a sequence called recursion.
    //Recursion-->solving same problem again nd again nd again.
    //Solving same problem using smaller problem of the same type.

    //breakdown a problem in a smaller version of same problem.(sub problems).
    //Visualize the problem into smaller version of itself.



    /*Recurion is very important for all these problems.
     * Data Structures
     * Merge sort, Quick sort
     * Binary Tree,
     * Binary search trees
     * Heap
     * pQ
     * segmentary
     * Graphs
     * Back tracking
     * Dynamic programming.
     */


     /*STEP 1 : Define the function.(sum,minimum,maximum...etc)
      --Decide what the function does.
      --Assume that it works.(Assumption is very imp.)
      */

      /*
       * Creating a mean logic.
       * STEP 2 : Main logic/Recursive equation.
       * solve bigger problem using ans of smaller problems(subproblem.)
       */
      /*STEP 3 : Base condition
       * when recursion should stop.
       */


       /*1.write a recursive function to return summation of first n natural numbers. */
       //(Take input==>sum(N) -->
       //(Return as output)-->sum of first N natural numbers
       //sum(x) --> sum of x natural numbers.


       public static int sum(int N) {
        if(N==1) return 1;
        return sum(N-1)+N;
       }
       public static void main(String[] args) {
        System.out.println(sum(4));
       }

    
    
}
