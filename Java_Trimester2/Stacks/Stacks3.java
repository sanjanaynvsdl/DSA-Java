import java.util.*;
//10

//10 Questions
//1 Nearestr smaller elememt on left 
//2 Nearest smaller  element on left find index 
//3 Nearest smaller element on right
//4 Nearest smaller element on right find index 
//5 Nearest greater element on left
//6 Nearest greater element from right side 
//7 Nearest greater element on left  find index
//8 Nearest greater element from right side, find index
//9 find the distancs between every ith elemenet and next greater element 
//10 for every ith element find the distance between next greater on left and next greater on right 
/*Build and array of next greater left , right take the difference  */
public class Stacks3 {

//1
/*Given a array of positive integers . For every index i find the 
nearest smaller element on the left of i 
[4.2.5.10.8,2]
[-1,-1,2,5,5,-1] ==> smaller element 
*/
public static int[] newaresrSmaller(int A[]) {
    int ans[]=new int[A.length];
    Stack<Integer> st=new Stack<Integer>();

    for(int i=0;i<A.length;i++) {
        if(st.isEmpty()) {
            st.push(A[i]);
            ans[i]=-1;
        }
        else if(A[i]>st.peek()) {
            ans[i]=st.peek();
            st.push(A[i]);
        }
        else {
            while(!st.isEmpty() && st.peek()>=A[i]) {
                st.pop();
                if(st.isEmpty()) {
                ans[i]=-1;
                }
                else {
                    ans[i]=st.peek();
                }
            }
            st.push(A[i]);
           
        }
    }
    return ans;
}

    

public static void main(String[] args) {
    int A[]={4,2,5,10,8,3};
        //1
    int ans[]=newaresrSmaller(A);
        for(int i=0;i<ans.length;i++) {
            System.out.print(ans[i]+" ");
        }
        //2
    int ans1[]=newarestIndex(A);
        for(int i=0;i<ans1.length;i++) {
            System.out.print(ans1[i]+" ");
        }

    }
    // //3
    // int ans2[]=smallerRight(A);
    //     for(int i=0;i<ans2.length;i++) {
    //         System.out.print(ans2[i]+" ");
    //     }
    

    //2
    /*Given a array of positive numbers for every index i find the
     index of the nearest smaller number of the left of i [0,i-1] */
     public static int[] newarestIndex(int A[]) {
        int ans[]=new int [A.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<A.length;i++) {
            if(st.isEmpty()) {
                st.push(i);
                ans[i]=-1;
            }
            else if(A[i]>A[st.peek()]) {
                ans[i]=st.peek();
                st.push(i);
            }
            else {
                while(!st.isEmpty() && A[st.peek()]>=A[i]) {
                    st.pop();
                    if(st.isEmpty()) {
                        ans[i]=-1;
                    }
                    else {
                        ans[i]=st.peek();
                    }
                }
                st.push(i);
            }
        }
        return ans;
     }

        //3
        /*Given a array of positive integers . For every index i find the 
        nearest smaller element on the right of i 
        [4.2.5.10.8,2]
        [2,-1,2,8,2,-1] ==> smaller element  from right
        */
        public static int[] smallerRight(int A[]) {
            int ans[]=new int [A.length];
            Stack<Integer> st= new Stack<>();
            for(int i=A.length-1;i>=0;i--) {
                if(st.isEmpty()) {
                    st.push(A[i]);
                }
                else if(A[i]>st.peek()) {
                    ans[i]=st.peek();
                    st.push(A[i]);
                }
                else {
                    while(!st.isEmpty() && st.peek()>=A[i]) {
                        st.pop();
                        if(st.isEmpty()) {
                            ans[i]=-1;
                        }
                        else {
                            ans[i]=st.peek();
                        }
                    }
                    st.push(A[i]);
                }
            }
            return ans;
        }

        //4
        /*Given an array of positive integers find the greater element on the left  */


}
