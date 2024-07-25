import java.util.*;
public class DP4{
    //1 Google  Maximize sum 

    //KnapSack(below questions are based on this) (Most commonly asked problem) recursively and iteratively!
    //(in all these cases we have ) TC :O(NK) => called pseudo-Polynomial time complexities
    //In all these cases we can solve if we have K- value larger.

    //2 Minimize weight KnapSack
    //3 Coin Change Problem (freq asked)
    //4 Equal array partition!



    //1
    //Google
    /* You are wine seller you have arranged bottels in linear order we cannot take bottels in the middle 
     * only the bottels from the corners can be sold.
     * 
     * [2,4,6,2,5]
     * years=1 ..
     * 2*1 + 5*2 + 4*3 + 2*4 + 5*2 = 62
     * There are diff possibilities too 
     * Maximize the cost of selling the bottels.
     */
    //recursive
    //Dp
    //Iterative


    //2
    /*KnapSack
    Given N items each with a weight and a value. Find th emax value that can be obtained by picking
    items such that total weight  <= max capacity of sack(k)
    * Every item can be picked at max once
    * Taking an item partially is not allowed

    K=50
    W[]=20  10  30  40
    V[]=100 60 120 1504
    50 = 20,30
    50 = 40,10
    */

    //3
    /* Coin-Change-problem
    Given N coins and a sum K, Find the no. of ways to form the sum K if a coin can be picked at once
    C [7,4,9,6,11,5,13,8] K=22
    //Similar to sum of the sub-sequence(a version of knapSack problem)

    -> small, change what if the element can be choosed as many times as we want!
    (This is similar to back-tracking combination sum problem)
     */

     //4
     //Equal array partition
     /*Given an array. count the so. of ways to partition all the elements into 2 sets of equal sum
      * A: 1 5 3 6 9 2
             /\
            /  \
           V    V
      [1,3,9]   [5,6,2] =>13
      So, in 1 way we can partition
           
      */

      //5
      //Partiotion the array into 


}