package Recursions;
// import java.util.*;

public class Recursion3 {
    /*Tower of Hanai*/
    /*Define the function
     * 
     * void TOH(N(no of discs) , Source(A), Destination(C), Auxilary)
     * voif TOH(N,source,destin',aux)
     * moving N no. of discs to destination tower from source using Auxilary!
     * prints the correct order of N discs from S to D using Aux!
     */

     /*
      * Recursive eqn : move N-1 discs from source to Auxilary using destination(sub probelm)
      1. TOH (N-1,source,Auxilary<Destination)                           ==>  N-1 discs from source to destination id Aux(B)    
      2. print ("MOve from source" __ to "Destination" __ )              ==> last disc moved from source to destination!
      3. TOH (N-1,aux,Destination,source)                                ==> N-1 discs from aux (placed in source) moved to destination! 


    BAse Condition : 1. if(N==0) return; */

    static void TOH(int N, String sour,String Des,String Aux) {
            
        //Base condition
        //if(N==1)??
        if(N==0)
        return;
        TOH(N-1,sour,Aux,Des);
        System.out.println("Move from"+sour+"to"+Des);
        TOH(N-1,Aux,Des,sour);
        

     }
     public static void main(String[] args) {
      
     }
}      



    

