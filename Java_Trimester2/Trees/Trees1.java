//Trees 
//pre-order
//In-order
//Post-order
//Identical

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
public class Trees1 {
    public void inOrder(treeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }

    public void postOrder(treeNode root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val);
    }
    public void preOrder(treeNode root) {
        if(root==null) {
            return;
        }
        System.out.println(root.val);
        preOrder(root.left); 
        preOrder(root.right);
    }
    //1
    /*Given two binary trees return true if both are identical and have same values else false */
    //fail fast approach
    public boolean Identical(treeNode rootA, treeNode rootB) {
        if(rootA==null  && rootB==null) {
            return true;
        }
        if(rootA==null || rootB==null) {
            return false;
        }
        if(rootA.val!=rootB.val) {
            return false;
        }
        return (Identical(rootA.left, rootB.left) && Identical(rootA.right, rootB.right));  

    }


    public static void main(String[] args) {
        // treeNode root=new treeNode(5);
        // root.left=new treeNode(7);
        // root.right=new treeNode(10);
        // root.left.right=new treeNode(11);
        treeNode rootA=new treeNode(5);
        rootA.left=new treeNode(7);
        rootA.right=new treeNode(10);
        treeNode rootB=new treeNode(5);
        rootB.left=new treeNode(7);
        rootB.right=new treeNode(10);
        Trees1 obj=new Trees1();
        System.out.println(obj.Identical(rootA, rootB));
        
        


    }
    
}
