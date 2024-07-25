
//Binary search tree
//Insertion
 
//In-order traversal of a binary search tree is in a sorted order
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

public class BST3 {
    //Root value is alwasys greater than the left subtree and less than the right subtree
    // LST <=Root<=RST
    
    /*Given a binary search tree return and find the target */
    //For a skwed BST worst case is O(N) TC
    
    public boolean searchBST(treeNode root, int val) {
        if(root==null) {
            return false;
        }
        if(root.val==val) {
            return true;
        }
        if(root.val>val) {
            return searchBST(root.left, val);
        }
        return searchBST(root.right, val);
    }


    //2
    /*Given a binary search tree insert k */ 
    //TC O(N)
    //SC O(N)
    public treeNode insert(treeNode A, int k) {
        if(A==null) {
            return new treeNode(k);
        }
        else if(A.val<k) {
            A.right=insert(A.right, k);
            //In  every iteration we are updating the links
        }
        else {
            A.left=insert(A.left,k);
        }
        return A;
        

    }
   public static void main(String[] args) {
       treeNode root=new treeNode(10);
       root.left=new treeNode(5);
       root.right=new treeNode(15);
       root.left.left=new treeNode(3);
       root.left.right=new treeNode(7);
       root.right.left=new treeNode(13);
       root.right.right=new treeNode(17);
       BST3 obj=new BST3();
       System.out.println(obj.searchBST(root, 7));
   }

    
}
