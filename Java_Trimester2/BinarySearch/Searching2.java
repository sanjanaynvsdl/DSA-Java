
// import java.util.*;

public class Searching2 {
    //08-11-2023
    //1 Floor/ceil Value
    //2 Sammlest index of target
    //3 Largest index of the target
    //4 Rotated array find target
    //5 Single element in array
    //6 Frequency of the target!
    //7 Local minima and maxima


    /*1*/
    //find the floor value of a given number.
    /*public static int floorValue(int A[],int K) {
        int s=0;
        int e=A.length-1;
        int ans=Integer.MIN_VALUE;
        while(s<=e) {
            int mid=s+(e-s)/2;
            if(A[mid]==K) {
                return A[mid];
            }
            else if(A[mid]>K){
                
                e=mid-1;
            }
            else {
                ans=A[mid];
                s=mid+1;
            }

        }return ans;
    } 
    public static void main(String[] args) {
        int A[]={2,3,6,7,9,11,15};
        int K =  10;
        int a = floorValue(A, K);
        System.out.println(a);
    }*/
    


    /*2 */
    /*Given a sorted array , given a target return the smallest index of the target */
    //time complexity is O(N)

    //brute force 
    /*public static int indexi(int A[],int K){
        for(int i=0;i<A.length;i++) {
            if(A[i]==K) {
                return i;
            }
        }return -1;
    }*/
    /*public static void main(String[] args) {
        int A[]={-5,-5,-5,0,0,0,1,1,2,2,3};
        int K=0;
        int a=leastIndex(A, 0);
        System.out.println(a);
    } 
    //O(log N)
    public static int leastIndex(int A[],int K) {
        int s=0;
        int e=A.length-1;
        int ans=0;
        while(s<=e) {
            int mid=s+(e-s)/2;
            if(A[mid]==K) {
                ans=mid;
                e=mid-1;
                //s=mid+1; == To find the larger index of the given target 
            }
            else if(A[mid]>K) {
                e=mid-1;
            }
            else {
                s=mid+1;
                
            }
        }return ans;
        
    }*/

    /*3*/
    /*Given a sorted array , given a target return the LARGER index of the target */
    //brute force by using loops.
    //BInary
    /*public static int  largerIndex(int A[],int K) {
        int s=0;
        int e=A.length-1;
        int ans=0;
        while(s<=e) {
            int mid=s+(e-s)/2;
            if(A[mid]==K) {
                ans=mid;
                //e=mid-1; ==To find the lower index of the given target
                s=mid+1;  
            }
            else if(A[mid]>K) {
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }return ans;
        
    }*/


    /*4*/
    /*Given a sorted array which is rotated (all elements are distinct ) find the target
     *Sorted and rotated (we dont know how many times we rotated)
     * { -1 2 3 4 5 6 7 8 9 10 20 30 }
     * //rotating by 4 positions
     * {5 6 7 8 9 10 20 30 -1 2 3 4 }
     * 
     * //sorted and  rotated == Concatenation of two sorted arrays
     * 
     */
/*public static int index1(int A[],int B) {
    int s=0;
    int e=A.length-1;
    while(s<=e) {
     int mid=s+(e-s)/2;
     if(A[mid]==B) {
        return mid;
     }
    if(A[mid]>A[s]) {
        if(B>=A[s] && B<A[mid]) {
            e=mid-1;
        }
        else {
            s=mid+1;
        }
    }
    else {
        if(B<=A[e] && B>A[mid]) {
            s=mid+1;
        }
        else {
            e=mid-1;
        }
      }
    }return 0;

    
}
public static void main(String[] args) {
    int A[]={4,5,6,3,0,1,2};
    int B=5;
    int a=index1(A, B);
    System.out.println(a);
}*/



/*5*/
/*Given a unsorted array all elemnts are repeated twice except one element 
 * all duplicates are together 
 * Return the index of single element
 */
/*public static int target(int A[]) {
    int s=0;
    int e=A.length-1;
    if(A.length==1) return A[0];
    if(A[0]!=A[1]) return A[0];
    if(A[A.length-1]!=A[A.length-2]) return A[A.length-1];
    while(s<=e) {
        int mid=s+(e-s)/2;
        if(A[mid]!=A[mid+1] && A[mid]!= A[mid-1]) {
            return A[mid];

        }
        else if(mid%2==0) {
            if(A[mid]==A[mid+1]) {
                s=mid+1;
            }
            else {
                e=mid-1;
            }
        }
        else {
            if(A[mid]==A[mid-1]){
                s=mid+1;
            }
            else {
                e=mid-1;
            }
        }
     }return -1;
    }
    


public static void main(String[] args) {
    int A[]={1,1,2,2,4,4,7,7,9,9,3,3,4,4,8,1,1};
    int a=target(A);
    System.out.println(a);*/



/*6*/
 /*Given a unsorted array return any local minima
Local minima=the element should be smaller than its neighbours
Array has all distinct elements
we can optimize tp (N)1/2 root N or log(N)
  */

  //Brute force
  /*public static int localminima(int A[]) {
    for(int i=1;i<A.length-1;i++) {
        if(A[i]<A[i-1] && A[i]<A[i+1]) {
            return A[i];
        }
    } return -1;
  }*/

  /*public static int localMinima(int A[]) {
    //int s=0;//int this case there is error array index out of bound 
    //int e=A.length-1;
    int s=1;
    int e=A.length-2;
    if(A.length==1) {
        return A[0];
    }
    if(A[0]<=A[1]) {
        return A[0];
    }
    if(A[A.length-1]<=A[A.length-2]) {
        return A[A.length-1];
    }
    while(s<=e) {
        int mid=s+(e-s)/2;
        if(A[mid]<A[mid-1] && A[mid]<A[mid+1]) {
            return A[mid];
        }
        if(A[mid]>A[mid-1]) {
            e=mid-1;
        }
        else {
            s=mid+1;
        }
    }return -1;
  }
  public static void main(String[] args) {
    int A[]={11,3,5,7,10,6,11};
    int a=localMinima(A);
    System.out.println(a+" ");
    }*/


    //6
    /*Given an array and a target find and return the frequency of the of the number */
    
    /*public static int leastIndex(int A[],int K) {
        int s=0;
        int e=A.length-1;
        int ans=0;
        while(s<=e) {
            int mid=s+(e-s)/2;
            if(A[mid]==K) {
                ans=mid;
                e=mid-1;//to find the smaller index of the target
            }
            else if(A[mid]>K) {
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }return ans;
    }
    public static int largeIndex(int A[],int K) {
        int s=0;
        int e=A.length-1;
        int ans=0;
        while(s<=e) {
            int mid=s+(e-s)/2;
            if(A[mid]==K) {
                ans=mid;
                s=mid+1;// == To find the larger index of the given target 
            }
            else if(A[mid]>K) {
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }return ans;    
    }
    public static int frequency(int A[],int K) {
        int least=leastIndex(A, K);
        int large=largeIndex(A, K);
        return large-least+1;

    }
    public static void main(String[] args) {
        int A[]={-5,-5,-5,0,0,0,1,1,2,2,3};
        int K=0;
        int a= frequency(A, K);
        System.out.println(a);
    }*/

    /*7*/
    /*Given an array find the local minina there might be more than one local minima */
    public static int localMinima(int A[]) {
        int s=0;
        int e=A.length-1;
        if(A.length==1) return A[0];
        if(A[0]<A[1]) return A[0];
        if(A[A.length-1]<A[A.length-2]) return A[A.length-1];

        while(s>=e) {
            int mid=s+(e-s)/2;
            if(A[mid]<A[mid-1] && A[mid]<A[mid+1]) {
                return A[mid];
            }
            else if(A[mid]>A[mid+1]) {
                s=mid+1;
            }
            else {
                e=mid-1;
            }

        }return -1;

    }



    //Practice Single number!
    /*public static int singleNumber(int A[]) {
        int s=0;
        int e=A.length-1;
        if(A[0]!=A[1]) return A[0];
        if(A[A.length-1]!=A[A.length-2]) return A[A.length-1];
        while(s>=e) {
            int mid=s+(e-s)/2;
            if(A[mid]!=A[mid+1] && A[mid]!=A[mid-1]) {
                return A[mid];
            }
            else if(mid%2==0) {
                if(A[mid]==A[mid+1]) {
                    s=mid+1;
                }
                else {
                    e=mid-1;
                }
            }
                else {
                    if(A[mid]==A[mid-1]) {
                        s=mid+1;
                    }
                    else {
                        e=mid-1;
                    }
                    
                }
            }return -1;
        }*/
     }



