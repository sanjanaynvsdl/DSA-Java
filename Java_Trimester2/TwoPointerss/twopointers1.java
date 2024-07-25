public class twopointers1 {
    //1 Sum ==k
    //2 Diff ==k
    //3 MinDiff  3 pointers --> Amazon
    //4 MaxWater 2 pointers


    /*
     * 2 pointers
     * 3 ppointers
     * k pointers
     * All these techniques fall under two pointers
     * Imp 4 points
     * 1.physical significance of the pointer--> wt actually the poniters are representing (Range)
     * 2. How to intialize the problems
     * 3. How to change the pointer / MOve the pointer
     * 4. When to stop 
     */


     //1
     /*Given an array and a number k find a pair in which their exist A[i]+A[j]==k
      * i!=j can also be done using recursion and hash map
      */

      /*public static boolean sumPair(int A[],int k) {
        int i=0;
        int j=A.length-1;
        while(i<j) {
            if(A[i]+A[j]==k) {
                return true;
            }
            else if(A[i]+A[j]>k) {
                j--;
            }
            else {
                i++;
            }
        }return false;
      }
      public static void main(String[] args) {
            int A[]={1,2,3,4,5,6,7,8,9,10};
            int k=17;
            System.out.println(sumPair(A,k));
      }*/


      //2
      /*Given a sorted array given a number check if there any two numbers their difference is equal to k 
       * can also be solve using hash map!
       * 
      */
      /*public static boolean diffPair(int A[],int k) {
        int i=1;
        int j=0;
        while(j<i && i<A.length) {
            if(A[i]-A[j]==k) {
                return true;
            }
            else if(A[i]-A[j]<k) {
                i++;
            }
            else {
                j++;
                if(i==j) {
                    i++;
                }
            }
        }return false;
    }
    public static void main(String[] args) {
            int A[]={0,1,3,6,8,11};
            int k=5;
            System.out.println(diffPair(A,k));
    }*/

    //3 (Amazon)
    /*Given three sorted arrays A,B and C find i, j  & k such that 
     * max(A[i],B[i],C[i])-min(A[i],B[i],C[i]) is minimum
     */
    /*public static int[] minDiff(int A[],int B[],int C[]) {
        int i=0;
        int j=0;
        int k=0;
        int ans[]=new int [3];
        int minDiff=Integer.MAX_VALUE;
        while(i<A.length && j<B.length && k<C.length) {
            int max=Math.max(A[i],(Math.max(B[j],C[k])));
            int min=Math.min(A[i],(Math.min(B[j],C[k])));
            int currDiff=max-min;
            if(currDiff<minDiff) {
                minDiff=currDiff;
                ans[0]=i;
                ans[1]=j;
                ans[k]=k;
            }
            
            if(A[i]==min) i++;
            else if(B[j]==min) j++;
            else k++;
        }
        return ans;

    }*/


    //4
    /*GIven Given an array containing the heights of the N walls Find maximum amout 
    of water getting accumulated between any two walls
     */

     //Brute force O(N^2) 
    /* int ans=Integer.MAX_VALUE;
     for(int i=0;i<A.length;i++) {
        for(int j=i+1;j<A.length;j++) {
            int area=(j-i) * Math.min(i,j);
            ans=Math.max(ans,area);
        }
     }*/ 

   /* public static int maxWater(int A[]) {
        int i=0;
        int j=A.length-1;
        int ans=Integer.MIN_VALUE;
        while(i<j) {
            int area=(j-i) * Math.min(A[i],A[j]);
            ans=Math.max(ans,area);
            if(A[i]<A[j]) {
                i++;
            }
            else {
                j--;
            }

        }return ans;
         
     }
     public static void main(String[] args) {
        int A[]={3,7,4,5,2};
        System.out.println(maxWater(A));
     } */ 


     //5
     /*GIven an array and an integer B return the min swap required to bring all elements <=B together  */

    //  public static int minSwap(int A[],int B) {
        


    //  }

      

    
}
