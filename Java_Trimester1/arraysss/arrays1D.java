package arraysss;

// import java.util.*;

public class arrays1D {
  // syntax 9-08-2023
  //datatype [] variable_name = new datatype [size];

  /* the above data type represents what type of data is stored in the array  
   * cannot mix and match data typer[a,3,name]{incorrect}
   */


   /*  int [] A = new int [3]; //of size 10 
    A[0]=sc.nextInt();  //takes input i=01,2,3,.. index
    A[1]=sc.nextInt();
    A[2]=sc.nextInt();

    int [] A = new int [10];
    for(int i=0;i<10;i++) {
        A[i]=sc.nextInt(); //input 
    }
    */

    /*write a function takes all values of the array returns their summation average ma03\
    21rks */
   /*  public static int sumofarray(int[]A) {
        int sum =0;
        for(int i=0;i<A.length;i++) {
            sum = sum+A[i];
        }
        return sum;
    }
    public static double avgmarks(int [] A) {
        int sum = sumofarray(A);
        return (sum/A.length);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] A = new int [N];
        for(int i=0;i<N;i++) {
            A[i]=sc.nextInt();
        }
        double sum = avgmarks(A);
        System.out.println(sum);
    }
*/




/* search a given element in array */
 /*public static boolean element(int [] A,int target) {
    for(int i=0;i<A.length;i++) {
        if(A[i]==target) {
            return true;
        }
    }
    return false;
}
public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int T = sc.nextInt();
    int A [] = new int [N];
    for(int i=0;i<N;i++) {
        A[i]=sc.nextInt();
    }
    System.out.println(element(A,T));
   }
   
   */

     /*find first and last index of given target [2,4,3,5,6,7,2,3,4,] target 4 so */

  /* public static void firstandlast(int []A,int target) {
       for(int i=0;i<A.length;i++) {
         if(A[i]==target) {
              System.out.print("first index "+i);
                 break;
             }
         }
             for(int i=A.length-1;i>=0;i--) {
                 if(A[i]==target) {
                    System.out.println("last index "+i);
               break;
           }
       }
   }
    
    public static void main (String args[]) {
         Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
         int A[] = new int [N];
        for(int i=0;i<N;i++) {

             A[i]=sc.nextInt();
         }
         int target =sc.nextInt();
      firstandlast(A,target); //if we use void in function we should not use sop just write functionname
      */ 



/* write a function which takes an array and returns the count of elements which have atleast one element
 greater than them in array[1,2,3,4,5,6,7] except 7 print 1,2,3,4,5,6==6
  */
   /* public static int countofsmall(int []A) {
    int count=0;
    for(int i=0;i<A.length;i++) {
        for(int j=0;j<A.length;j++) {
            if(A[j]>A[i]) {
                count++;
                break;
            }
        }
        
    }
    return count;
  }
  public static void main (String []args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int [] A= new int [N];
    countofsmall(A);
  }*/ //how to call this functon
     
     
     
  
 

 /* Single number!!
  [2,3,4,5,4,3,2] given an array where all the numbers occur 2 times
  except one element write a function to return the single number 
  */

  /*public static int singlenumber(int [] A) {
    int ans=0;
    for(int i=0;i<A.length;i++) {
        int count=0;
        for(int j=0;j<A.length;j++) {
            if(A[i]==A[j]) {
                count++;
            }
        }

        if(count==1) {
         ans = A[i];
       break;

        }
    }
    return ans;
    
  }
  public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int [] A = new int[N];
    for(int i=0;i<N;i++) {
      A[i]=sc.nextInt();
    }
    System.out.print(singlenumber(A));
  } */





/* find the maximum element of array write a function and return the maximum of array */
 /*public static int maximum(int A []) {
int max = A[0];
for(int i=1;i<A.length;i++) {
   if(A[i]>max) {
    max = A[i];
   }
  }
  return max;
}
  public static void main (String args []) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A [] = new int [N];
    for(int i=0;i<N;i++) {
      A[i]=sc.nextInt();
    }
    
    System.out.print(maximum(A));
  }

  */


 //Array1D3  16-08-2023

  /* write a function to rotate array k times
     * [1,2,3,4,5,6,7,8,9] k=4 rotate 4 times
     * [9,1,2,3,4,5,6,7,8] k=1st time
     * [8,9,1,2,3,4,5,6,7] k=2nd time
     * [7,8,9,1,2,3,4,5,6] k=3rd time
     * outputt
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




/*public static void  rightshift(int A []) {
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



}
*/

 }
