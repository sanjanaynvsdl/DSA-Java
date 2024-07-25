import java.util.*;
//14-02-2024
//1 Recover-binary tree (Values are swapped)
//2 hashSet implementation
//3 AVL Tree and Red-black tree
//4 
class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;
    public TreeNode(int val) {
        this.val=val;
        left=null;
        right=null;
    }
}
//O(N) for binary trees = should traverse complere tree
//log(N) Balanced binary tree
//Construct balanced binary search tree
//Self-balancing  binary search tree (BST) 
/*Even after multiple insertions the  height remains same => So called AVL tree*/
//AVl tree and  Red-black tree are self-balancing BST => Can be solved in O(long N);


//De-code a mystery!
/*How can hashmao and hashset gives us ans in O(1) TC */
//hash function : irrespective of input these gives a result such that our result is between 0 to N-1
//Simply takinf the % value that leads to same bucket (example : data have patterns) => to avoid this we use hash functions explore 
public class Trees5 {


    //1
    /*Given an array sorted array intially then two values have been swapped return the two values. */
    //solving like using two-pointers 
    public static int[] Swapped(int A[]) {
        int ans[] = {-1, -1};
        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[i - 1]) {
                if (ans[0] == -1) {
                    ans[0] = A[i];
                    ans[1] = A[i - 1];
                } else {
                    ans[1] = A[i];
                }
            }
        }
        return ans;
    }
    //2
    /*Given A BST where two nodes have been swapped find it and fix */
    //Using in-order tarvaersal
    TreeNode prev=null; 
    public int[] swappedMain(TreeNode A) {
        int ans[]={-1,-1};
        swappedNodes(A,ans);
        return ans;
    }
    public void  swappeNodes(TreeNode A, int ans[]) {
        if(A==null) {
            return;
        }
        swappeNodes(A.left, ans);
        if(prev!=null) {
            if(A.val<prev.val) {
                if(ans[0]==-1) {
                    ans[1]=prev.val;
                    ans[0]=A.val;
                }
                else {
                    ans[0]=A.val;
                }
            }
        }





    }
}
