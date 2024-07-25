//1 Maximum height of binary tree
//2 Count of nodes in a binary tree!
//3 Check if the binary tree is a mirror image of itself
//4 Convert a binary tree to its mirror image
//5 search for a node in a binary tree

class treeNode{
    treeNode left;
    treeNode right;
    int val;
    public treeNode(int val) {
        this.val=val;
        left=null;
        right=null;
    }
}

public class BTress2 {
    //1
    //To need the height of the complete tree we need height of LST and RST
    /*You are given the root node of a binary tree A. find the maximum height of the given tree
    A binaru tree height is the number of nodes along the longest path from the root node down the to teh farthest leaf node.
    */
     public int solve(treeNode A) {
        if(A==null) return 0;
        int l=solve(A.left);
        int r=solve(A.right);
        return Math.max(l,r)+1;
    }
    //Post-order traversal
    //In many cases we use this post-orser traaversal

    //2
    /*Count of nodes for a given binary tree */
    public int solvee(treeNode A) {
        if(A==null) return 0;
        int l=solve(A.left);
        int r=solve(A.right);
        return l+r+1;
    }

    //3
    /*Given two binary trees and a mirror image return true if the binary tree is a mirror image of the other */
    //this is a pre-Order traversal(fast-fail approach)
    public boolean isMirror(treeNode A, treeNode B) {
        if(A==null && B==null) return true;
        if(A==null || B==null) return false;
        if(A.val!=B.val) return false;
        return (isMirror(A.left,B.right) && isMirror(A.right,B.left));
    }
    //Google
    //4
    /*Max howell the one rejected by google who was unable to answer this question but invented home brew in mac
    which is used to download packages in mac */
    /*Given a binary tree return the mirror image of the binary tree */
    //Explain the approaches at a higher level perspective
    public treeNode  mirror(treeNode A) {
            if(A==null)    return null;
            mirror(A.left);
            mirror(A.right);
            treeNode temp=A.left;
            A.left=A.right;
            A.right=temp;
            //swap(A.left,A.right);
            return A;
    }
    //5
    /*TC and SC are same for pre-order , In-order , post-order but using pre-order 
    traversal it saves unneccesary iterations */
    /*Given a node search it in a binary tree  */
    public boolean search(treeNode A, int B) {
        if(A==null) return false;
        if(A.val==B) return true;
        return (search(A.left,B) || search(A.right,B));
    }

    //6
    /*Given two arrays one of the array is pre-order and other is in-order build a binary tree using these two arrays  */
    public treeNode buildtree(int A[],int B[],int Ps,int Pe, int Is,int Ie) {
        if(Ps>Pe || Is>Ie) {
            return null;
        }
        treeNode root=new treeNode(A[Ps]);
        int idx=Is;
        for(int i=Is;i<=Ie;i++) {
            if(B[i]==A[Ps]) {
                idx=i;
                break;
            }
        }
        int z=idx-Is;
        root.left=buildtree(A,B,Ps+1,Ps+z,Is,idx-1);
        root.right=buildtree(A,B,Ps+z+1,Pe,idx+1,Ie);
        return root;
    }

    public treeNode buildTree(int[] A, int[] B) {
        int Ps=0;
        int Pe=A.length-1;
        int Is=0;
        int Ie=B.length-1;
        return  buildtree(A,B,Ps,Pe,Is,Ie);
        
    }


}
