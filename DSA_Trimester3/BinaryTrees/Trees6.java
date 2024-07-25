import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int v, TreeNode left, TreeNode right) {
        this.val=v;
        this.left=left;
        this.right=right;
    }
}

public class Trees6 {
    // 19-02-2024
    //1  Complete binary tree
    /* //2
     *
     * In-Order
     * Pre-Order
     * Post-Order
     * 
     * With recursion(3)
     * without recursion(Stacks) In- Iterative method
     * In O(1) SC / TC
     * Also called as Moris In-order traversal
     * 
     */



    //1
    //Coomplete- binary tree => to count nodes of this in O((log N)^2)
    //all levels are completely filled
    public int countComplete(TreeNode A) {
        if(A==null) {
            return 0;
        }
        int leftHeight=getHeight(A.left);
        int rightHeight=getHeight(A.right);
        if(leftHeight==rightHeight) {
            // return  
        }
        return 0;
    }
    public int getHeight(TreeNode A) {
        int ht=0;
        while(A!=null) {
            ht++;
            A=A.left;
        }
        return ht;//
    }
    

    //2
    //In-Order
    public void InOrder(TreeNode A) {
        if(A==null) {
            return;
        }
        InOrder(A.left);
        System.out.println(A.val);
        InOrder(A.right);
    }

    
    
}
